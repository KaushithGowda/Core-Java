package com.abc.Day4;

import java.util.Scanner;

public class SumOfFirstNnumbers {

	public static void main(String[] args) {

		System.out.println("---------------------------------------------");

		System.out.println("Program3 :: Sum of first N numbers");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number ::");
		int n = scan.nextInt();
		int sum = 0;
		int i = 1;
		while(i <= n) {
			sum += i;
			i++;
		}
		System.out.println(sum);
		
		System.out.println("---------------------------------------------");
	}

}
