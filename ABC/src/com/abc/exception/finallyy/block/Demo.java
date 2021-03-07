package com.abc.exception.finallyy.block;

public class Demo {

	void fun1()
	{
		
		System.out.println("fun1() is connecting to Db");
		System.out.println("fun1() is connected");
		
		try
		{
			fun2();
		}
		catch(Exception e)
		{
			System.out.println("exception caught in fun1()");
			throw e;
		}
		
		finally
		{
			System.out.println("fun1() is disconnected");
		}
		
	}

	void fun2()
	{
		
		System.out.println("fun2() is connecting to Db");
		System.out.println("fun() is connected");
		
		try
		{
			int a, b, c;
			a=10;
			b=0;
			c=a/b;
			System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println("exception caught in fun2()");
			throw e;
		}
		
		finally
		{
			System.out.println("fun2() is disconnected");
		}
		
	}
}
