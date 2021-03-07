package com.abc.exception.customexception02;

public class NegativeAmountException extends Exception {

	public String getMessage()
	{
		return "unable to dispatch....amount entered is negative";
	}
}
