package com.abc.mulithreading10;

public class Warrior extends Thread {

	String res1 = "Sarpastra";
	String res2 = "Bramhmastra";
	String res3 = "Pashupatastra";
	
	public void run()
	{
		Thread t = Thread.currentThread();
		if(t.getName()=="RAMA")
		{
			ramaAccResource();
		}
		else 
		{
			ravanAccResource();
		}
	}
	
	public void ramaAccResource()
	{
		try
		{
		  synchronized(res1)
		  {
			System.out.println("rama has acquired " + res1);
			Thread.sleep(5000);
			synchronized(res2)
			{
				System.out.println("rama has acquired " + res2);
			    Thread.sleep(5000);
			    synchronized(res3)
			    {
			    	System.out.println("rama has acquired " + res3);
			    }
			 }
		  }
		}
		 catch(Exception e)
		 {
			 System.out.println("Interuppted" + e.getMessage());
		 }
	 }

	public void ravanAccResource()
	{
		try
		{
		 synchronized(res1)
		 {
			System.out.println("ravan has acquired " + res1);
			Thread.sleep(5000);
			synchronized(res2)
			{
				System.out.println("ravan has acquired " + res2);
			    Thread.sleep(5000);
			    synchronized(res3)
			    {
			    	System.out.println("ravan has acquired " + res3);
			    }
			}
		 }
		}
		 catch(Exception e)
		 {
			 System.out.println("Interuppted" + e.getMessage());
		 }
	 }
	
}
		
		
    
