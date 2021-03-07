package com.abc.Day11;

import java.util.Scanner;

public class ArrayAddress2 {

	public static void main(String[] args) {

		System.out.println("------------------------------------------------------");

		System.out.println("Program2");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of Array:: ");
		int size = scan.nextInt();
		int[] a = new int[size];

		System.out.print("Enter the values:: ");
		for (int i = 0; i <= a.length-1; i++) {
			a[i] = scan.nextInt();
		}
		int[] c = demo(a);
		System.out.println("After the modification:: ");
		for(int i=0; i<=c.length-1; i++) {
			System.out.println(a[i]);
		}
	}

	static int[] demo(int[] a) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value:: ");
		int value = scan.nextInt();
		for (int i = 0; i <= a.length - 1; i++) {
			a[i] = value;
		}
		return a;
	}
}
