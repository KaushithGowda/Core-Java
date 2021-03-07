package com.abc.Day7;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {

		System.out.println("----------------------------------------------------");
		System.out.println("Program3 :: Check for StrongNumber");

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Number:: ");
		int n = scan.nextInt();
		int temp = n;
		int r;
		int sum = 0;
		while (n > 0) {

			r = n % 10;
			int fact = 1;

			for (int i = 1; i <= r; i++) {

				fact *= i;
			}
			sum = sum + fact;
			n = n / 10;
		}
		if (sum == temp) {
			System.out.println(temp+" is a Strong Number");
		} else {
			System.out.println(temp+" is not a Strong Number");
		}
	}

}
