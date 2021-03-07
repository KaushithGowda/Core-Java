package com.abc.Day4;

import java.util.Scanner;

public class NoOfFactors {

	public static void main(String[] args) {

		System.out.println("---------------------------------------------");
		
		System.out.println("Program7 :: Check count of factors of a number");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number ::");
		int n = scan.nextInt();
		int count = 0;
		
		for(int i=1; i<=n; i++) 
		{
			if(n%i == 0) {

				++count;
			}
		}
		System.out.println("No of Factors :: "+count);
		
		System.out.println("---------------------------------------------");
	}

}
