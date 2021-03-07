package com.abc.Day4;

import java.util.Scanner;

public class Concat {

	public static void main(String[] args) {

		System.out.println("--------------------------------------------------");
		System.out.println("Program1 :: Concating two numbers");
		
		System.out.println("Case1:");
		Scanner scan1 = new Scanner(System.in);
		System.out.print("Enter the value of a1::");
		int a1 = scan1.nextInt();
		System.out.print("Enter the value of b1::");
		int b1 = scan1.nextInt();
		String c1 = a1+""+b1;
		System.out.println(c1);
		
		System.out.println("--------------------------------------------------");
		
		System.out.println("Case2:");
		Scanner scan2 = new Scanner(System.in);
		System.out.print("Enter the value of a2::");
		int a2 = scan2.nextInt();
		System.out.print("Enter the value of b2::");
		int b2 = scan2.nextInt();
		String s1 = Integer.toString(a2);
		String s2 = Integer.toString(b2);
		String res = s1 + s2;
		System.out.println(res);

		System.out.println("--------------------------------------------------");
	}

}
