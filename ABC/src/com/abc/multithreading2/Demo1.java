package com.abc.multithreading2;

import java.util.Scanner;

public class Demo1 extends Thread{

	public void run()
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
}



