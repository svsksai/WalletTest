package Wallet.Wallet;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import com.cg.Exception.AccountIdException;
import com.cg.Exception.TxException;
import com.cg.Exception.ValidateException;
import com.cg.serice.WalletService;
import com.cg.serice.WalletServiceImpl;
/**********************************************************************************
 * 
 * @Author Name  : venkata sai kumar
 * Class Name    : Wallet Test
 * Description   : cheacking code
 *
 * 
 **********************************************************************************/
@TestInstance(Lifecycle.PER_CLASS)
public class WalletTest {
	static WalletService ser;

	@BeforeAll
	public static void beforeAll() {
		ser = new WalletServiceImpl();
	}

	@Test
	@DisplayName("Test user given accId")
	public void walletTest1() {
		assertThrows(ValidateException.class,
				() -> ser.getTxns("12345", LocalDate.of(2019, 07, 14), LocalDate.of(2020, 01, 15)));
	}

	@Test
	@DisplayName("Test user given Dates")
	public void walletTest2() {
		assertThrows(ValidateException.class,
				() -> ser.getTxns("123456", LocalDate.of(2020, 01, 15), LocalDate.of(2019, 07, 14)));
	}

	@Test
	@DisplayName("Test transactions")
	public void walletTest3() {
		assertThrows(TxException.class,
				() -> ser.getTxns("123456", LocalDate.of(2018, 01, 15), LocalDate.of(2018, 07, 14)));
	}

	@Test
	@DisplayName("Test accId in Repo")
	public void walletTest4() {
		assertThrows(AccountIdException.class,
				() -> ser.getTxns("974137", LocalDate.of(2018, 01, 15), LocalDate.of(2018, 07, 14)));
	}

	@Test
	@DisplayName("Test trasactions accId1")
	public void walletTest5() throws ValidateException, TxException, AccountIdException {
		assertTrue(((ser.getTxns("123456", LocalDate.of(2019, 07, 14),LocalDate.of(2020, 03, 15))).size())==5);
	}
	@Test
	@DisplayName("Test trasactions accId2")
	public void walletTest6() throws ValidateException, TxException, AccountIdException {
		assertEquals(3,((ser.getTxns("123456", LocalDate.of(2019, 10, 14),LocalDate.of(2020, 02, 15))).size()));
	}
}