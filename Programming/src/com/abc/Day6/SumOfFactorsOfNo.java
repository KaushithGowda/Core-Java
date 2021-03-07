package com.abc.Day6;

import java.util.Scanner;

public class SumOfFactorsOfNo {

	public static void main(String[] args) {

		System.out.println("------------------------------------------------------------");
		System.out.println("Program3 :: Print Sum of factors of a number");
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number:: ");
		int n = scan.nextInt();
		int sum = 0;
		for(int i=1; i<=n; i++)
		{
			if(n%i == 0) 
			{
				sum+=i;
			}
		}
		System.out.println(sum);
		
	}

}
