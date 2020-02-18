package com.cg.entity;
/**********************************************************************************
	 * 
	 * @Author Name  : venkata sai kumar
	 * Description   : 
	 * Method Name   :
	 * Parameter 1   : String accountId
	 * Parameter 2   : double balance
	 * Parameter 3   : String status
	 * 
	 **********************************************************************************/
public class Account {
	User user;
	private String accountId;
	private double balance;
	private String status;
	
	public Account(String accountId, double balance, String status,User user) {
		super();
		this.accountId = accountId;
		this.balance = balance;
		this.status = status;
		this.user=user;
	}
	
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	/**************************************************************
	 * To String Method To Print Account Details of user
	 * 
	 **************************************************************/
	@Override
	public String toString() {
		return "Account [user=" + user + ", accountId=" + accountId + ", balance=" + balance + ", status=" + status
				+ "]";
	}
	

}