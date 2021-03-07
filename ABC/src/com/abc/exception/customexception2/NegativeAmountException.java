package com.abc.exception.customexception2;

public class NegativeAmountException extends Exception{

	public String getMessage()
	{
		return "unable to dispatch negative amount...";
	}
}
