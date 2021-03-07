package com.abc.Day14;

import java.util.Scanner;

public class ZigZag {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the array1 size:: ");
		int n1 = scan.nextInt();
		System.out.print("Enter the array2 size:: ");
		int n2 = scan.nextInt();
		int[] a1 = new int[n1];
		int[] a2 = new int[n2];

		System.out.print("Enter the values for array1:: ");
		for (int i = 0; i <=a1.length-1; i++) {
			a1[i] = scan.nextInt();
		}
		System.out.print("Enter the values for array2:: ");
		for (int i = 0; i <= a2.length-1; i++) {
			a2[i] = scan.nextInt();
		}

		int k = 0;
		while (k < a1.length || k < a2.length) {
			if (k < a1.length)
				System.out.println(a1[k] + " ");
			if (k < a2.length)
				System.out.println(a2[k] + " ");
			k++;
		}

	}
}
