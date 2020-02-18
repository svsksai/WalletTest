package com.cg.dao;
/**********************************************************************************
 * 
 * @Author Name  : venkata sai kumar
 * Method Name   : viewTrans
 * Description   : getting transactions of given user's accId from fromDtate to toDate
 * Return Type   : List(List of Transactions)
 * Parameter 1   : String accId
 * Parameter 2   : LocalDate fromDate
 * Parameter 3   : LocalDate toDate
 * 
 **********************************************************************************/
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.cg.Exception.AccountIdException;
import com.cg.Exception.TxException;
import com.cg.Repo.Repository;
import com.cg.entity.Transaction;

public class WalletDaoImpl implements WalletDao {

	public List<Transaction> viewTrans(String accId, LocalDate fromDate, LocalDate toDate)
			throws TxException, AccountIdException {
		List<Transaction> txLst = new ArrayList<Transaction>();
		if (!Repository.map.containsKey(accId))
			throw new AccountIdException("No Account Found");
		Repository.lst.stream().filter(tx -> tx.getAccount().getAccountId().equals(accId))
				.filter(tx -> (tx.getDateOfTransaction().compareTo(fromDate) > 0)
						&& (tx.getDateOfTransaction().compareTo(toDate) < 0))
				.forEach(tx -> txLst.add(tx));
		if (txLst.isEmpty())
			throw new TxException("No Txn Found!");

		return txLst;

	}

}
