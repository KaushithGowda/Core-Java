package com.abc.Day14;

import java.util.Arrays;
import java.util.Scanner;

public class ReversingArrayFromIndex {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the array1 size:: ");
		int n1 = scan.nextInt();
		int[] a1 = new int[n1];
		System.out.println("Enter the values for array1:: ");
		for (int i = 0; i <=a1.length - 1; i++) {
			a1[i] = scan.nextInt();
		}
		int[] a2 = new int[a1.length];
		System.out.print("Enter the index:: ");
		int k = scan.nextInt();
		/*
		 * Printing the reverse array for(int i=0; i<k; i++) {
		 * System.out.println(a1[i]); } for(int j=a1.length-1; j>=k; j--) {
		 * System.out.println(a1[j]); }
		 */
		for (int i = 0; i < k; i++) {
			a2[i] = a1[i];
		}
		int p = k;
		for (int i = a1.length - 1; i >= k; i--) {
			a2[p] = a1[i];
			++p;
		}
		System.out.println(Arrays.toString(a2));
	}

}
