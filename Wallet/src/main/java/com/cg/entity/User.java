package com.cg.entity;
/**********************************************************************************
	 * 
	 * @Author Name  : venkata sai kumar
	 * Description   : 
	 * Method Name   :
	 * Parameter 1   : String userId
	 * Parameter 2   : String userName
	 * Parameter 3   : String password
	 * Parameter 4   : String phoneNumber
	 * 	
	 **********************************************************************************/
public class User {
	private String userId;
	private String userName;
	private String password;
	private String phoneNumber;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public User(String userId, String userName, String password, String phoneNumber) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.phoneNumber = phoneNumber;
	}
	/*******************************************
	 * To String Method To Print User Details
	 * 
	 *********************************************/
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", password=" + password + ", phoneNumber="
				+ phoneNumber + "]";
	}
	
	

}