package com.abc.Day7;

import java.util.Scanner;

public class FrequencyOfNumber {

	public static void main(String[] args) {

		System.out.println("----------------------------------------------");
		System.out.println("Program1 :: Find frequency of a number");

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number:: ");
		int n = scan.nextInt();
		System.out.print("Enter the digit:: ");
		int d = scan.nextInt();
		int count = 0;

		while (n > 0) {

			int r = n % 10;
			if (r == d) {

				++count;

			}
			n = n / 10;
		}
		System.out.println("Frequency of "+d+" is :: "+count);
	}

}
