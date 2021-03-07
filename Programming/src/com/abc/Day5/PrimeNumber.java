package com.abc.Day5;

import java.util.Scanner;

public class PrimeNumber {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		System.out.println("------------------------------------------------");
		System.out.println("Program :: Prime no check and print");
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number :: ");
		int n = scan.nextInt();
		int count = 0;
		
		for(int i=1; i<=n; i++) 
		{
			
			if( n%i == 0) 
			{
				++count;
			}
		}
		
		if(count == 2) {
			System.out.println("It is a prime number");
		} else {
			System.out.println("It is a not prime number");
		}
	}
}


