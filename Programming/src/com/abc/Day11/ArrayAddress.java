package com.abc.Day11;

public class ArrayAddress {

	public static void main(String[] args) {

		System.out.println("----------------------------------------------------------------");
		
		System.out.println("Program1");
		int[] a = new int[5];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		int[] c = demo(a);
	}

	static int[] demo(int[] b) {
		System.out.println("Inside static method" + b);
		return b;
	}
}
