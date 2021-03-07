package com.abc.Day12;

import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of array:: ");
		int size = scan.nextInt();
		int[] a = new int[size];
		System.out.print("Enter the values of array:: ");
		for(int i=0; i<=a.length-1; i++) {
			a[i] = scan.nextInt();
		}
		int size2 = scan.nextInt();
		int[] b = new int[size2];
		System.out.print("Enter the values of array:: ");
		for(int i=0; i<=b.length-1; i++) {
			b[i] = scan.nextInt();
		}
		
	}

}
