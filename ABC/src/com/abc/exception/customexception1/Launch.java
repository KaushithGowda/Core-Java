package com.abc.exception.customexception1;

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
				throw new ALessThanBException();// alternative way to throw ref e 
			}
		  	
		}
		
		catch(ALessThanBException e)
		{
			System.out.println(e.getMessgae());
		}
		
		System.out.println("exiting main() normally");
		
	}
}

