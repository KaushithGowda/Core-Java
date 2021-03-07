package com.abc.exception.finallyy.block;

public class Launch {

	public static void main(String[] args) {

		System.out.println("main() connecting to DB");
		System.out.println("main() is connected");
		
		Demo d = new Demo();
		
		try
		{
			d.fun1();
		}
		catch(Exception e)
		{
			System.out.println("exception caught in main()");
		}
		
		System.out.println("main() is disconnected");
		
	}
}
