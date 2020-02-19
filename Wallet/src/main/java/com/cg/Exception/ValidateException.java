package com.cg.Exception;
/**********************************************************************************
 * 
 * @Author Name  : venkata sai kumar
 * Class Name    : ValidateException
 * Description   : cheacking user entered accId and fromDate,toDate is in correct form 
 *                 
 *
 **********************************************************************************/
public class ValidateException extends Exception{

	public ValidateException() {
		super();
	
	}

	public ValidateException(String message) {
		System.err.println(message);
	
	}

}
