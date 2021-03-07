package com.abc.Day4;

public class SwapWithTemp {

	public static void main(String[] args) {

		System.out.println("---------------------------------------------");

		System.out.println("Program4 :: Swap two numbers using temp variable");
		
		int a = 30;
		int b = 40;

		System.out.println("Before swap "+"a = "+ a +" and " + "b = "+b);
		int temp = b;
		b = a;
		a = temp;
		System.out.println("After swap "+"a = "+ a +" and " + "b = "+b);
		
		System.out.println("---------------------------------------------");
	}

}
