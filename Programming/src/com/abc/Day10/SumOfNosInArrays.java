package com.abc.Day10;

import java.util.Scanner;

public class SumOfNosInArrays {

	public static void main(String[] args) {

		System.out.println("---------------------------------------");

		System.out.println("Program5");
		System.out.println("Sum of Numbers present in even indexes");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size range:: ");
		int size = scan.nextInt();
		int[] a = new int[size];
		int sum = 0;
		
		System.out.println("Enter the Values:: ");

		for (int i = 0; i <= a.length - 1; i++) {
			a[i] = scan.nextInt();
		}
		
		for (int i = 0; i <= a.length - 1; i++) {
			if (i % 2 == 0) {
				sum += a[i];
			}
		}
		System.out.println(sum);
	}

}
