package com.practise.multithreading.racecondition;

public class MsWorld extends Thread{

	public void run()
	{
		
		Thread t=Thread.currentThread();
		
		if(t.getName()=="TYPE") 
		{
			typing();
		}
		else if(t.getName()=="SPELLCHECK") 
		{
			spellChecking();
		}
		else
		{
			autoSaving();
		}
	}
	
	public void typing()
	{
	for(int i=1; i<=5; i++) {
		
		System.out.println("typing...");
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
		     System.out.println("typing interrupted");
		}
		
	 }
	}
	
	public void spellChecking()
	{
	for(int i=1; i<=5; i++) {	
		System.out.println("spellChecking...");
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			System.out.println("spellChecking interrupted");
		}
	 }	
	}
	
	public void autoSaving()
	{
    for(int i=1; i<=5; i++) {	
		System.out.println("autoSaving...");
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			System.out.println("autoSaving interrupted");
		}
     }	
	}
}
