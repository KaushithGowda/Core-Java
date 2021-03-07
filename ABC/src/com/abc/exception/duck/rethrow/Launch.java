package com.abc.exception.duck.rethrow;

public class Launch {

	public static void main(String[] args) {


		System.out.println("entering the main()");
		Demo d = new Demo();
		
		try
		{
			System.out.println("entering try block in main()");
			d.fun1();
		}
		catch(Exception e)
		{
			System.out.println("exception handled in main()");
		}
		
		System.out.println("exiting main() normally");
	}

}
