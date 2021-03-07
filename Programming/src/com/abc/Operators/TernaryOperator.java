package com.abc.Operators;
//28-01-2021
public class TernaryOperator {

	public static void main(String[] args) {

		System.out.println("----------------------------------------------");
		System.out.println("Program1");
		
		int a1 = 7;
		int b1 = 8;
		int c1 = (a1 > b1) ? a1 : b1;
		System.out.println(c1);
		
		System.out.println("----------------------------------------------");
		System.out.println("Program2");
		
		int a2 = 7;
		int b2 = 8;
		int c2 = (a2 < b2) ? a2 : b2;
		System.out.println(c2);
		
		System.out.println("----------------------------------------------");
		System.out.println("Program3");
		
		int a3 = 7;
		int b3 = 8;
		boolean c3 = (a3 < b3) ? true : false;
		System.out.println(c3);
		
		System.out.println("----------------------------------------------");
		System.out.println("Program4");
		
		int a4 = 7;
		int b4 = 8;
		float c4 = (a4 < b4) ? 66.6f : 77.7f;
		System.out.println(c4);
		
		System.out.println("----------------------------------------------");
		System.out.println("Program5");
		
		int a5 = 7;
		int b5 = 8;
		String c5 = (a5 < b5) ? "Hi" : "Hello";
		System.out.println(c5);
		
		System.out.println("----------------------------------------------");
	}

}
