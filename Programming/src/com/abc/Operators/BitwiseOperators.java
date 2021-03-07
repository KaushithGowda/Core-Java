package com.abc.Operators;
//28-01-2021
public class BitwiseOperators {

	public static void main(String[] args) {

		System.out.println("Bitwise Operators");
		System.out.println("---------------------------------------------------------------");
		System.out.println("Program1");
		System.out.println("Bitwise AND");
		
		int a1 = 7;//0111
		int b1 = 8;//1000
		int c1 = a1 & b1;//0
		System.out.println(c1);//0000
		
		System.out.println("---------------------------------------------------------------");
		System.out.println("Program2");
		System.out.println("Bitwise OR");
		
		int a2 = 7;
		int b2 = 8;
		int c2 = a2 | b2;//15
		System.out.println(c2);//1111
		
		System.out.println("---------------------------------------------------------------");
		System.out.println("Program3");
		System.out.println("Bitwise EXOR");
		
		int a3 = 7;//0111
		int b3 = 8;//1000
		int c3 = a3 ^ b3;//15
		System.out.println(c3);//1111
		
		System.out.println("---------------------------------------------------------------");
		
	}

}
