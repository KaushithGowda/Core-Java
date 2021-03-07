package com.abc.exception.duck;

public class Demo {

	void fun1()
	{
		System.out.println("entering the fun1");
		fun2();
	}
	
	void fun2()
	{
		System.out.println("entering the fun2");
		int a, b, c;
		a=10;
		b=0;
		c=a/b;//exception occured
	}
}
