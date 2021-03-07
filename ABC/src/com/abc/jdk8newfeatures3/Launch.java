package com.abc.jdk8newfeatures3;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Consumer;

public class Launch {
//15-01-2021
	public static void main(String[] args) {
		
		//Lambda Expression
		Runnable r1 = ()-> {
			
			System.out.println("Banking started");
			System.out.println("Enter the account number");
			Scanner scan = new Scanner(System.in);
			int accNo = scan.nextInt();
			System.out.println("Enter the password");
			int pwd = scan.nextInt();
			System.out.println("Banking completed");
			
		};

		Runnable r2 = ()-> {
			
			System.out.println("Addition started");
			System.out.println("Enter the first number");
			Scanner scan = new Scanner(System.in);
			int a = scan.nextInt();
			System.out.println("Enter the second number");
			int b = scan.nextInt();
			int c = a+b;
			System.out.println(c);
			System.out.println("Addition completed");
			
		};

		Runnable r3 = ()->{
			
			System.out.println("Printing started");
			for(int i=0; i <=5; i++) {
				
				System.out.println("Hello World");
			    try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			
			}
			System.out.println("Printing completed");
			
		};
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		Thread t3 = new Thread(r3);
		
		t1.start();
		t2.start();
		t3.start();
		
	}
}
