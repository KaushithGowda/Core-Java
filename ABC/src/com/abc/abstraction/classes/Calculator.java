package com.abc.abstraction.classes;

public abstract class Calculator {

	void add()
	{
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println(c);
	}
	
	abstract void main();
	
}
