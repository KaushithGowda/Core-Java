package com.abc.Day7;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {

		System.out.println("----------------------------------------------------");
		System.out.println("Program5 :: Check for ArmstrongNumber");

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Number:: ");
		int n = scan.nextInt();
		int temp = n;
		int r;
		int c;
		int sum = 0;
		while (n > 0) {

			r = n % 10;
			c = r*r*r;
			sum += c;
			n = n / 10;
		}
		if (temp == sum) {
			System.out.println(temp + " is a ArmstrongNumber");
		} else {
			System.out.println(temp + " is not a ArmstrongNumber");
		}
	}

}
