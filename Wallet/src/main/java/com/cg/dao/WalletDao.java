package com.cg.dao;
/**********************************************************************************
 * 
 * @Author Name  : venkata sai kumar
 * Method Name   : viewTrans
 * Description   : getting transactions of given user's accId from fromDtate to toDate
 * Return Type   : List(List of Transactions)
 * Parameter 1   : String acctd
 * Parameter 2   : LocalDate fromDate
 * Parameter 3   : LocalDate toDate
 * 
 **********************************************************************************/
import java.time.LocalDate;
import java.util.List;

import com.cg.Exception.AccountIdException;
import com.cg.Exception.TxException;
import com.cg.entity.Transaction;

public interface WalletDao {

	public List<Transaction> viewTrans(String accId,LocalDate fromDate,LocalDate toDate) throws AccountIdException,TxException;

}
