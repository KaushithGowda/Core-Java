package com.abc.Day4;

import java.util.Scanner;

public class SwapWithoutTemp {

	public static void main(String[] args) {

		System.out.println("---------------------------------------------");

		System.out.println("Case1 :: Addition and subtraction");
		System.out.println("Program5 :: Swap two numbers without using temp variable");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the value of first variable :: ");
		int a1 = scan.nextInt();
		System.out.print("Enter the value of second variable :: ");
		int b1 = scan.nextInt();
		System.out.println("Before swap "+"a1 = "+ a1 +" and " + "b1 = "+b1);
		a1 = a1 + b1;//10+20  a1 = 30
		b1 = a1 - b1;//30-20  b1 = 10
		a1 = a1 - b1;//30-10  a1 = 20
		System.out.println("After swap "+"a1 = "+ a1 +" and " + "b1 = "+b1);
		
		System.out.println("---------------------------------------------");

		System.out.println("Case2 :: EXOR");
		System.out.print("Enter the value of first variable :: ");
		int a2 = scan.nextInt();
		System.out.print("Enter the value of second variable :: ");
		int b2 = scan.nextInt();
		System.out.println("Before swap "+"a2 = "+ a2 +" and " + "b2 = "+b2);
		int res = a2 ^ b2;
		int a2_1 = a2 ^ res;
		int b2_1 = b2 ^ res;
		System.out.println("After swap "+"a2 = "+ a2_1 +" and " + "b2 = "+b2_1);
		
		System.out.println("---------------------------------------------");
		
		System.out.println("Case3 :: */");
		System.out.print("Enter the value of first variable :: ");
		int a3 = scan.nextInt();
		System.out.print("Enter the value of second variable :: ");
		int b3 = scan.nextInt();
		System.out.println("Before swap "+"a3 = "+ a3 +" and " + "b3 = "+b3);
		int a3_1 = ( b3 * a3 ) / a3;
		int b3_1 = ( a3 * b3 ) / b3;
		System.out.println("After swap "+"a3 = "+ a3_1 +" and " + "b3 = "+b3_1);
		
		System.out.println("---------------------------------------------");
	}

}
