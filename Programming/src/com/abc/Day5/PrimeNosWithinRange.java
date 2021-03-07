package com.abc.Day5;

import java.util.Scanner;

public class PrimeNosWithinRange {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		System.out.println("-------------------------------------------------");
		System.out.println("Program :: Printing Nos Within Range");

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the starting range:: ");
		int start = scan.nextInt();
		System.out.print("Enter the ending range:: ");
		int end = scan.nextInt();
		
		//Range
		for(int i=start; i<=end; i++) 
		{
		
			int count = 0;
			for(int j=1; j<=i; j++)
			{
				if( i%j == 0)
				{
					++count;
				}
			}
			if(count == 2) 
			{
				System.out.println(i);
			}
			
		}
		
	}
}


