package com.abc.multithreading7;

public class Demo2 extends Thread{

	public void run()
	{
		
		System.out.println("printing activity started");
		for(int i=1;i<=5;i++)
		{
			System.out.println("abc");
		    try
		    {
				Thread.sleep(5000);			
		    }
		    catch(Exception e) 
		    {
			    System.out.println("Interrupted");
		    }
		}
		System.out.println("printing activity completed");
		
	}
	
}
