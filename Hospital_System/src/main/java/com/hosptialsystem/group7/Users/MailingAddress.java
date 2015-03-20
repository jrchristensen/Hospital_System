package com.hosptialsystem.group7.Users;


public class MailingAddress {

	private String street;
	private String city;
	private int zipCode;
	
	
	public MailingAddress(){
		
	}
	/**
	 * 
	 */
	public MailingAddress(String st, String cty, int zpcd ){
		street=st;
		city=cty;
		zipCode=zpcd;
	}
}
