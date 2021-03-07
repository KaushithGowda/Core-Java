package com.abc.Day11;

import java.util.Scanner;

public class NoOfZerNegPosNosInArray {

	public static void main(String[] args) {

		System.out.println("--------------------------------------------------");

		System.out.println("Program3");
		System.out.println("To find number of zeros, positive and negative values in an array");

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of the array:: ");
		int size = scan.nextInt();
		int[] a = new int[size];
		System.out.println("Enter the Values:: ");
		for (int i = 0; i <= a.length - 1; i++) {
			int value = scan.nextInt();
			a[i] = value;
		}
		demo(a);
	}

	static void demo(int[] b) {
		int pos = 0;
		int neg = 0;
		int zer = 0;
		
		for (int i = 0; i <= b.length - 1; i++) {
			if ( b[i]<0 ) {
				++neg;
			} if( b[i]>0 ) {
				++pos;
			} if( b[i]==0) {
				++zer;
			}
		}
		System.out.println("The Positive values are :: "+pos);
		System.out.println("The Negative values are :: "+neg);
		System.out.println("The Zero values are :: "+zer);
	}
}
