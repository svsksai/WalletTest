package com.cg.entity;
/**********************************************************************************
 * 
 * @Author Name  : venkata sai kumar
 * Description   : 
 * Method Name   :
 * Parameter 1   : int transactionId
 * Parameter 2   : String description
 * Parameter 3   : LocalDate dateOfTransaction
 * Parameter 4   : float amount
 * 	
 **********************************************************************************/
import java.time.LocalDate;

public class Transaction {
	private Account account;
	private int transactionId;
	private String description;
	private LocalDate dateOfTransaction;
	private float amount;

	public Transaction(Account account) {
		super();
		this.account = account;
	}

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getDateOfTransaction() {
		return dateOfTransaction;
	}

	public void setDateOfTransaction(LocalDate dateOfTransaction) {
		this.dateOfTransaction = dateOfTransaction;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
	public Transaction(int transactionId, String description, LocalDate dateOfTransaction, float amount, Account acc) {
		super();
		this.transactionId = transactionId;
		this.description = description;
		this.dateOfTransaction = dateOfTransaction;
		this.amount = amount;
		this.account = acc;

	}
	/**************************************************************
	 * To String Method To Print Transactions of a account for an user
	 * 
	 **************************************************************/
	@Override
	public String toString() {
		return "Transaction  transactionId=" + transactionId 
				+ ", dateOfTransaction=" + dateOfTransaction + ", amount=" + amount ;
	}

	

}