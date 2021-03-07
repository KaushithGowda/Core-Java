package com.abc.Day13;

import java.util.Arrays;

public class Array1 {

	public static void main(String[] args) {

		System.out.println("----------------------------------------------------------------------------------------------------");
		
		System.out.println("Program1:: Arrays.toString()");
		
		int[] a = new int[3];
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;

		System.out.println(a+" <====I in the address indicates its an integer array and bracket indicates address");//address
		System.out.println(Arrays.toString(a));//values
		System.out.println("----------------------------------------------------------------------------------------------------");
	}

}
