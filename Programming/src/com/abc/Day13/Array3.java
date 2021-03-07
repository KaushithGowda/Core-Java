package com.abc.Day13;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the size of array1:: ");
		int n1 = scan.nextInt();
		int[] a1 = new int[n1];
		System.out.print("Enter the size of array2:: ");
		int n2 = scan.nextInt();
		int[] a2 = new int[n2];

		System.out.println("Enter the values of array1:: ");
		for (int i = 0; i <= a1.length - 1; i++) {
			a1[i] = scan.nextInt();
		}
		System.out.println("Enter the values of array2:: ");
		for (int i = 0; i <= a2.length - 1; i++) {
			a2[i] = scan.nextInt();
		}
		common(a1, a2);
	}

	static void common(int[] a1, int[] a2) {
		
		LinkedHashSet lhs = new LinkedHashSet();
		System.out.println("Common Elements:: ");
		for (int i = 0; i <= a1.length - 1; i++) {
			for (int j = 0; j <= a2.length - 1; j++) {
				if (a1[i] == a2[j]) {
					lhs.add(a1[i]);
				}
			}
		}
		System.out.println("The common elements are "+lhs);
	}

}
