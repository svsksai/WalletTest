package com.cg.Exception;
/**********************************************************************************
 * 
 * @Author Name  : venkata sai kumar
 * Class Name    : TxException
 * Description   : cheacking user entered accId is having any Transactins in Repository 
 *                 
 *
 * 
 **********************************************************************************/
public class TxException extends Exception{

	public TxException() {
		super();
		
	}

	public TxException(String message) {
		super(message);
		
	}

	
}
