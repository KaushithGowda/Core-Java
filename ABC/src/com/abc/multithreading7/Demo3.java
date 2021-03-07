package com.abc.multithreading7;

import java.util.Scanner;

public class Demo3 extends Thread{

	 public void run() 
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
