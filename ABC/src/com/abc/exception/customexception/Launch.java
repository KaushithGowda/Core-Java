package com.abc.exception.customexception;

import java.util.Scanner;

public class Launch {

	public static void main(String[] args) {

		int a, b, c;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a: ");
		a = scan.nextInt();
		System.out.println("enter b: ");
		b = scan.nextInt();
		
		try 
		{
			if(a>b)
			{
				c = a-b;
				System.out.println("diff is: "+c);
			}
			else
			{
//				Exception e = new Exception(); 
//				throw e;
				throw new Exception();// alternative way to throw ref e 
			}
		  	
		}
		catch(Exception e)
		{
			System.out.println("sub not possible....a<b");
		}
		System.out.println("exiting main() normally");
	}

}
