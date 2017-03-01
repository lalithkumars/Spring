package com.lalith.SpringDemo;

public class Greeting {

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void greet()
	{
		System.out.println("Welcome to the World of "+getMessage());
	}
}
