package com.abc.sample;

import java.util.Scanner;

public class InnerClasses {
	//main method
	public static void main(String[] args) {

				//Inner Classes
				class Demo1 implements Runnable {

					public void run() {
						System.out.println("Banking started");
						System.out.println("Enter the account number");
						Scanner scan = new Scanner(System.in);
						int accNo = scan.nextInt();
						System.out.println("Enter the password");
						int pwd = scan.nextInt();
						System.out.println("Banking completed");
					}
				}
				
				class Demo2 implements Runnable {

					public void run() {
						Scanner scan = new Scanner(System.in);
					    System.out.println("Addition started");
					    System.out.println("Enter the first number");
					    int a = scan.nextInt();
					    System.out.println("Enter the second number");
					    int b = scan.nextInt();
					    int c = a+b;
					    System.out.println(c);
					    System.out.println("Banking completed");
					}
				}
				class Demo3 implements Runnable {
					
					public void run() {
				     	System.out.println("Printing started");
				    	for(int i=0; i <=5; i++) {
						
						System.out.println("Hello World");
						try {
							Thread.sleep(4000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					
				    	}
				    	System.out.println("Printing completed");
					}
				}
				
				Demo1 d1 = new Demo1();
				Demo2 d2 = new Demo2();
				Demo3 d3 = new Demo3();
				
				Thread t1 = new Thread(d1);
				Thread t2 = new Thread(d2);
				Thread t3 = new Thread(d3);
				
				t1.start();
				t2.start();
				t3.start();

			}
}
