package com.abc.exception.customexception02;

public class AmountEqualToBalenceException extends Exception {

	public String getMessage()
	{
		return "unable to dispatch....amount entered is equal to balence";
	}
}
