package com.abc.Day7;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {

		System.out.println("----------------------------------------------------");
		System.out.println("Program2 :: Check for PerfectNumber");

		System.out.println("----------------------------------------------------");
		System.out.println("Approach1");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Number :: ");
		int n = scan.nextInt();
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				if (n != i) {
					sum += i;
				}
			}
		}
		if (sum == n) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}

		System.out.println("----------------------------------------------------");
		System.out.println("Approach2");
		System.out.print("Enter the Number :: ");
		int n2 = scan.nextInt();
		int sum2 = 0;
		for (int i = 1; i < n2; i++) {
			if (n2 % i == 0) {
				sum2 += i;
			}
		}
		if (sum2 == n2) {
			System.out.println("It is a Perfect Number");
		} else {
			System.out.println("It is not a Perfect Number");
		}

	}

}
