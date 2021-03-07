package com.abc.multithreading8;

public class BathRoom implements Runnable{

	public void run()
	{
		
		try
		{
			Thread t = Thread.currentThread();
			System.out.println(t.getName()+ " has entered the bathroom");
            Thread.sleep(5000);
			System.out.println(t.getName()+ " is using bathroom");
			Thread.sleep(5000);
			System.out.println(t.getName()+ " has exited the bsthroom");
		}
		catch(Exception e)
		{
			System.out.println("Interuppted");
		}
		
	}
	
}
