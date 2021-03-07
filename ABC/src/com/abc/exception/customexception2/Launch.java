package com.abc.exception.customexception2;

import java.util.Scanner;

public class Launch {

	public static void main(String[] args) {

		int a,b;
		Scanner scan = new Scanner(System.in);
		a = 5000;
		System.out.println("enter the amount");
		b = scan.nextInt();
		
		try
		{
			if(b>a)
			{
				System.out.println("please collect the cash");
			}
			else if(b<a)
			{
				throw new MinimumBalenceException();
			}
			else if(b<0)
			{
				throw new NegativeAmountException();
			}
		}
		
		catch(MinimumBalenceException e)
		{
			System.out.println(e.getMessage());
		}
		
		catch(NegativeAmountException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
