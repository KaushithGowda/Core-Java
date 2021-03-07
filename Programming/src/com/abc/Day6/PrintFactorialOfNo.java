package com.abc.Day6;

import java.util.Scanner;

public class PrintFactorialOfNo {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		System.out.println("------------------------------------------------------------");
		System.out.println("Program4 :: Print Factorial of a number");
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Number :: ");
		int n = scan.nextInt();
		int output = 1;
		for(int i=1; i<=n; i++) 
		{
			output *= i; 
		}
		System.out.println(output);
	}

}
