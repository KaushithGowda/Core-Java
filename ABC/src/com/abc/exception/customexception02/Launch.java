package com.abc.exception.customexception02;

public class Launch {

	public static void main(String[] args) {

		Bank b = new Bank(5000);
		b.input();
		b.dispatchAmount();
		
	}

}
