package com.abc.Day6;

import java.util.Scanner;
import java.util.Arrays;

public class LargestPrimeNumber {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		System.out.println("------------------------------------------------------------");
		System.out.println("Program5 :: Print Largest Prime factor of a number");

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number:: ");
		int n = scan.nextInt();

		// Finding factors
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				// got factors i.e in i
				int count = 0;
				// checking factors are prime
				for (int j = 1; j <= i; j++) {
					if (i % j == 0) {
						++count;
					}
				}
				if (count == 2) {
					for(int k=0; k<=i; k++) {
						int[] a= new int[]{i};
						System.out.println(a.length);
					}
				}
			}
		}

	}

}
