package com.abc.multithreading;

import java.util.Scanner;

public class program1 {

	public static void main(String[] args) {

		/*whenever main method is called, a main stack is created in stack 
		and main method is placed in it. */
		
		/*two ways in which extra stack can be created
		 * 1.whenever an object is created of the class, which is extending thread class. 
		 *   Then an extra stack is created in bigger stack and then we need to
		 *   call start using that class object.
	     * 2.we can create object of thread class directly to create extra stack and pass 
		 *   ref of other class in thread object and call start using that thread object.*/
		
		Thread t = Thread.currentThread();//static method(no object is created)
		
		/*output of Thread.currentThread() ---> Thread[main,5,main]
		 * main ---> name of the thread
		 * 5 ---> priority of the thread
		 * main ---> stack under thread*/
		
		t.setName("ABC");//modifying the name of thread
		t.setPriority(3);//modifying the priority of thread
		//stack under thread cannot be modified
		
		System.out.println(t);
		
		System.out.println("banking started");
		System.out.println("enter the account number: ");
		Scanner scan = new Scanner(System.in);
		int an = scan.nextInt();
		System.out.println("enter the password: ");
		int pw = scan.nextInt();
		System.out.println("collect your money");
		System.out.println("banking completed");
		
		
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
			e.printStackTrace();
		    }
		}
		System.out.println("printing activity completed");
		
		
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
