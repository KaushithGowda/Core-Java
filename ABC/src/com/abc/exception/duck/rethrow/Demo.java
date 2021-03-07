package com.abc.exception.duck.rethrow;

public class Demo {

	void fun1()
	{
		System.out.println("entering the fun1");
		try 
		{
		    fun2();
		}
		catch(Exception e)
		{
			System.out.println("exception in fun1()");
			throw e;
		}
	}
		
	
	void fun2()
	{
		System.out.println("entering the fun2");
		int a, b, c;
		a=10;
		b=0;
		try 
		{
		    c=a/b;//exception occured
		    System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println("exception in fun2()");
			throw e;
		}
	}
}
