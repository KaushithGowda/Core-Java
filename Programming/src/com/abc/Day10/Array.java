package com.abc.Day10;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
 
		System.out.println("---------------------------------------------------");
		
		System.out.println("Program1");
		System.out.println("Array size scanned and filled with values");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size range:: ");
		int size = scan.nextInt();
		int[] a = new int[size];
		
		System.out.println("Enter the Values:: ");

		for(int i=0; i<=a.length-1; i++) {
		   a[i] = scan.nextInt();
		}
		
		for(int i=0; i<=a.length-1; i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("---------------------------------------------------");

		System.out.println("Program2");
		System.out.println("Array values replaced without using fill method");
		System.out.println("Enter the value to be replaced:: ");
		int value1 = scan.nextInt();
		
		for(int i=0; i<=a.length-1; i++) {
			a[i] = value1;
		}

		for(int i=0; i<=a.length-1; i++) {
			System.out.println(a[i]);
		}
	
		System.out.println("---------------------------------------------------");
		
	}

}
