package com.abc.Day5;

import java.util.Scanner;

public class SumOfDigits {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		System.out.println("----------------------------");
		System.out.println("Program :: Sum of digits");
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number:: ");
		int n = scan.nextInt();
		int temp = 0;
		int sum = 0;
		
		while(n>0) {
			temp = n % 10;
			sum = sum + temp;
			n = n/10;
		}
		System.out.println("Sum of digits :: "+sum);
	}

}
