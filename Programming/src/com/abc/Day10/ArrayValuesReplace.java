package com.abc.Day10;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayValuesReplace {

	public static void main(String[] args) {

		System.out.println("---------------------------------------------------");
		
		System.out.println("Program3");
		System.out.println("Array values replaced using fill method");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size range:: ");
		int size = scan.nextInt();
		int[] a = new int[size];
		
		System.out.println("Enter the value to be replaced:: ");
		int value2 = scan.nextInt();
		
		for(int i=0; i<=a.length-1; i++) {
			Arrays.fill(a, value2);
		}
		
		for(int i=0; i<=a.length-1; i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("---------------------------------------------------");

		System.out.println("Program4");
		System.out.println("Array values replaced using fill method");
		System.out.println("Enter the value to be replaced:: ");
		int value3 = scan.nextInt();
		int fromIndex = scan.nextInt();
		int to_Index = scan.nextInt();
		
		Arrays.fill(a,fromIndex,to_Index,value3);
		for(int i=0; i<=a.length-1; i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("---------------------------------------------------");
	}

}
