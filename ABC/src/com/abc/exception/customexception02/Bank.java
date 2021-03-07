package com.abc.exception.customexception02;

import java.util.Scanner;

public class Bank {

	int bal, amt;
	Bank(int x)
	{
		bal = x;
	}
	
	void input()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the amount");
		amt = scan.nextInt();
	}
	
	void dispatchAmount()
	{
		try
		{
			if(amt < 0)
			{
				throw new NegativeAmountException();
			}
			
			else if(amt > bal)
			{
				throw new MinimumBalenceException();
			}
			
			else if(amt == bal)
			{
				throw new AmountEqualToBalenceException();
			}
			
			else
			{
				System.out.println("please collect the money");
			}
		}
		catch(NegativeAmountException e)
		{
			System.out.println(e.getMessage());
		}
		catch(MinimumBalenceException e)
		{
			System.out.println(e.getMessage());
		}
		catch(AmountEqualToBalenceException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
