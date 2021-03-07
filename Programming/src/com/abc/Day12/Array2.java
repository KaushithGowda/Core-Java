package com.abc.Day12;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of array:: ");
		int size = scan.nextInt();
		int[] a = new int[size];
		int p=1;
		System.out.print("Enter the values of array:: ");
		for(int i=0; i<=a.length-1; i++) {
			a[i] = scan.nextInt();
			p = p*a[i];
		}
		
		for(int i=0; i<=a.length-1; i++) {
			System.out.println(p/a[i]+" ");
		}
	
	}

}
