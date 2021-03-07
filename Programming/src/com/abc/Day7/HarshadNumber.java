package com.abc.Day7;

import java.util.Scanner;

public class HarshadNumber {

	public static void main(String[] args) {

		System.out.println("----------------------------------------------------");
		System.out.println("Program4 :: Check for HarshadNumber");

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Number:: ");
		int n = scan.nextInt();
		int temp = n;
		int r;
		int sum = 0;
		while (n > 0) {

			r = n % 10;
			sum += r;
			n = n / 10;

		}
		if (temp % sum == 0) {
			System.out.println(temp + " is a Harshad Number");
		} else {
			System.out.println(temp + " is not a Harshad Number");
		}
	}

}
