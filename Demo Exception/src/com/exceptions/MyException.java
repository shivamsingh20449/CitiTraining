package com.exceptions;

public class MyException extends Exception{
	
	private String message;
	
	public void showCause()
	{
		System.out.println("you got some exception :( ");
		
	}
	
	public MyException(String message) {
		
		super(message);
		this.message=message;
		
	}
	
	public MyException() {
		message = "you got some exception :( " ;
	}
	
	@Override
	public void printStackTrace() {
		// TODO Auto-generated method stub
		super.printStackTrace();
		System.out.println("this is overridden error message ");
	}

}
