package com.abc.multithreading9;

public class BathRoom implements Runnable{

	//synchronized keyword is used to lock the resource after 1 thread is passed and it will allow next htread only afteer the execution of 1st thread 
	synchronized public void run()
	{
		/*The below statements which make only one thread to execute at a time are called as semaphores/monitor i.e try and catch block present below*/
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
