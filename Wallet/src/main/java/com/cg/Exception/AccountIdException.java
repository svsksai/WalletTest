package com.cg.Exception;
/**********************************************************************************
 * 
 * @Author Name  : venkata sai kumar
 * Class Name    : AccountIdException
 * Description   : cheacking user entered accId is available in Repository 
 *
 * 
 **********************************************************************************/
public class AccountIdException extends Exception{

	public AccountIdException() {
		super();
	
	}

	public AccountIdException(String message) {
		System.err.println(message);
	
	}

}
 
	