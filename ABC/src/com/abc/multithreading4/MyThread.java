package com.abc.multithreading4;

import java.util.Scanner;

public class MyThread extends Thread{

	public void run()
	{
		
		Thread t = Thread.currentThread();
		if(t.getName()=="BANK")
		{
			banking();
		}
		else if(t.getName()=="PRINT")
		{
			printing();
		}
		else
		{
			adding();
		}
		
	}
	
	public void banking()
	{
		
			System.out.println("banking started");
			System.out.println("enter the account number: ");
			Scanner scan = new Scanner(System.in);
			int an = scan.nextInt();
			System.out.println("enter the password: ");
			int pw = scan.nextInt();
			System.out.println("collect your money");
			System.out.println("banking completed");
			
	}
	
	public void printing()
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
	
	public void adding()
	{
		
		Scanner scan = new Scanner(System.in);
	    System.out.println("adding activity started");
		System.out.println("enter the first number: ");
		int num1 = scan.nextInt();
		System.out.println("enter the second number: ");
		int num2 = scan.nextInt();
		int num3 = num1+ num2;
		System.out.println(num3);
		System.out.println("adding activity completed");

	}
}
