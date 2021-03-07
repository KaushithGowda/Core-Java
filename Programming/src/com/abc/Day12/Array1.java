package com.abc.Day12;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[] a = new int[4];
		a[0] = 0;
		a[1] = 10;
		a[2] = 2;
		a[3] = 3;
		
		System.out.println("Enter the value:: ");
		int value = scan.nextInt();
        for(int i=0; i<=a.length-1; i++) {
			 if(a[i]==i) {
				 a[i] = value;
			 }
		}
        for(int i=0; i<=a.length-1; i++) {
        	System.out.println(a[i]);
        }
	 }
	
}
