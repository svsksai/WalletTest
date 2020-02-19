package com.cg.Repo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cg.entity.Account;
import com.cg.entity.Transaction;
import com.cg.entity.User;
/**********************************************************************************
 * 
 * @Author Name  : venkata sai kumar
 * Class Name    : Repository
 * Description   : storing all data
 *
 * 
 **********************************************************************************/
public class Repository {
	public static List<Transaction> lst = new ArrayList<Transaction>();
	public static Map<String, Account> map = new HashMap<>();
	
	
	static {
		User user1 = new User("101", "suman", "password", "7984531522");
		
		Account acc1 = new Account("123456", 1000, "Active", user1);
		
		Transaction tr1 = new Transaction(10001, "transfer by ****00", LocalDate.of(2019, 10, 14), 500, acc1);
		Transaction tr2 = new Transaction(10002, "transfer to ****21", LocalDate.of(2019, 11, 15), 300, acc1);
		Transaction tr3 = new Transaction(10003, "transfer by ****11", LocalDate.of(2019, 12, 15), 300, acc1);
		Transaction tr4 = new Transaction(10004, "transfer to ****21", LocalDate.of(2020, 01, 15), 300, acc1);
		Transaction tr5 = new Transaction(10005, "transfer by ****01", LocalDate.of(2020, 02, 15), 300, acc1);
		
		lst.add(tr1);
		lst.add(tr2);
		lst.add(tr3);
		lst.add(tr4);
		lst.add(tr5);
		
		map.put(acc1.getAccountId(), acc1);

		User user2 = new User("102", "lova", "passwordx", "7087524455");
		
		Account acc2 = new Account("112233", 1000, "Active", user2);
		
		Transaction tr6 = new Transaction(10003, "transfer to ****22", LocalDate.of(2009, 10, 10), 500, acc2);
		Transaction tr7 = new Transaction(10004, "transfer by ****52", LocalDate.of(2009, 11, 11), 300, acc2);
		Transaction tr8 = new Transaction(10002, "transfer to ****42", LocalDate.of(2009, 12, 15), 300, acc1);
		Transaction tr9 = new Transaction(10003, "transfer by ****51", LocalDate.of(2009, 01, 15), 300, acc1);
		Transaction tr0 = new Transaction(10004, "transfer to ****71", LocalDate.of(2010, 02, 15), 300, acc1);

		lst.add(tr6);
		lst.add(tr7);
		lst.add(tr8);
		lst.add(tr9);
		lst.add(tr0);

		map.put(acc2.getAccountId(), acc2);

	}

}
