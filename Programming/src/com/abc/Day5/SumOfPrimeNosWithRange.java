package com.abc.Day5;

import java.util.Scanner;

public class SumOfPrimeNosWithRange {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		System.out.println("-------------------------------------------");
		System.out.println("Program :: Sum of Prime Numbers within range");
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the starting range :: ");
		int start = scan.nextInt();
		System.out.print("Enter the ending range :: ");
		int end = scan.nextInt();
		int sum = 0;
		
		//Range
		
		for(int i=start; i<=end; i++) 
		{
		
			int count = 0;
			
			/*1 to i
			* prime numbers :: 
			* 1.remainder=0 
			* 2.two factors :: factors wont exceed number
			**/
			for(int j=1; j<=i; j++)
			{
				if( i%j == 0)
				{
					++count;
				}
			}
			if(count == 2) 
			{
				sum = sum + i;
			}
			
		}
		System.out.println(sum);
	}
}


