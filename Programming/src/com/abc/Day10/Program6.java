package com.abc.Day10;

import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {

		System.out.println("-------------------------------------------------------------------------------------------");

		System.out.println("Program5");
		System.out.println("Product of even index data and sum of odd index data and difference between them");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size range:: ");
		int size = scan.nextInt();
		int[] a = new int[size];
		int product = 1;
		int sum = 0;
		int Difference = 0;
		
		System.out.println("Enter the Values:: ");
		for (int i = 0; i <= a.length - 1; i++) {
			a[i] = scan.nextInt();
			if (i % 2 == 0) {
				product *= a[i];
			} else {
				sum += a[i];
			}
		}
		Difference = (product - sum);
		System.out.println("The Difference between the product of even index data and sum of odd index data ::"+ Difference);

		System.out.println("-------------------------------------------------------------------------------------------");
	}

}
