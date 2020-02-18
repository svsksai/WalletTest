package com.cg.clint;

import java.time.LocalDate;
import java.util.List;

import com.cg.Exception.AccountIdException;
import com.cg.Exception.TxException;
import com.cg.Exception.ValidateException;
import com.cg.entity.Transaction;
import com.cg.serice.WalletService;
import com.cg.serice.WalletServiceImpl;

public class WalletClient {

	public static void main(String[] args) throws ValidateException, TxException, AccountIdException {
		WalletService ser = new WalletServiceImpl();
		List<Transaction> lst = ser.getTxns("123456", LocalDate.of(2019, 07, 14), LocalDate.of(2020, 01, 15));
		lst.forEach(System.out::println);

	}

}
