package com.abc.exception.handling.handled2;

import java.util.Scanner;

public class Launch {

	public static void main(String[] args)
	{

		System.out.println("inside main()");
		Scanner scan = new Scanner(System.in);
		int a[] = new int[5];
		for(int i = 0; i <= 4; i++)
		{
			System.out.println("enter an element");
			a[i] = scan.nextInt();
		}
		try
		{
			for(int i=0; i<=5; i++)
			{
				System.out.println(a[i]);
			}
		}
		catch(Exception e)
		{
			System.out.println("do not breach the boundaries of the array");
		}
		System.out.println("exiting main() normally");
	}

}
