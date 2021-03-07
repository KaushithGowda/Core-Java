package com.abc.exception.customexception3;

import java.util.Scanner;

public class Rto {

	int r,a;
	public Rto(int r)
	{
		r = a;
	}
	
	void input()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the age");
		a = scan.nextInt();
	}
	
	void calculate()
	{
		try
		{
			if(a > 18 & a < 60)
			{
				System.out.println("satisfied age");
			}
			
			else if(a < 18)
			{
				throw new UnderAgeException();
			}
			
			else if(a >60)
			{
				throw new OverAgeException();
			}
		}
		
		catch(UnderAgeException e) 
		{
			System.out.println(e.getMessage());
		}
		
		catch(OverAgeException e) 
		{
			System.out.println(e.getMessage());
		}
	}
}
