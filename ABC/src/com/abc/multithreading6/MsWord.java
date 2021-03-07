package com.abc.multithreading6;

public class MsWord extends Thread{

	public void run()
	{
		
		Thread t=Thread.currentThread();
		if(t.getName()=="TYPE")
		{
			typing();
		}
		else if(t.getName()=="SPELLCHECK")
		{
			spellCheck();
		}
		else
		{
			autoSave();
		}
		
	}
	
	public void typing()
	{
		
		for(int i=1; i<=5; i++)
		{
			System.out.println("typing...");
		    try
		    {
			Thread.sleep(5000);
		    }
		    catch(Exception e)
		    {
		    	System.out.println("typing interrupted");
		    }
		   
		}
	}
	
	public void spellCheck()
	{
		
		//3.loop made infinite
		for(; ;)
		{
			System.out.println("spellCheck...");
		    try
		    {
			Thread.sleep(5000);
		    }
		    catch(Exception e)
		    {
		    	System.out.println("spellCheck interrupted");
		    }
		   
		}
	}
	
	public void autoSave()
	{
		//3.loop made infinite
		for( ; ;)
		{
			System.out.println("autoSave...");
		    try
		    {
			Thread.sleep(5000);
		    }
		    catch(Exception e)
		    {
		    	System.out.println("autoSave Interrupted");
		    }
		   
		}
	}
	
}
