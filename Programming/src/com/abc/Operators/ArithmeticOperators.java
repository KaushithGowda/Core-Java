package com.abc.Operators;

//27-01-2021 12pm
public class ArithmeticOperators {

	public static void main(String[] args) {

		System.out.println("-----------------------------------");
		System.out.println("Arithmetic Operator");
		System.out.println("Program1");

		int a = 10;
		int b = 20;
		System.out.println(a + b);// Addition
		System.out.println(a - b);// Subtraction
		System.out.println(a * b);// Multiplication
		System.out.println(a / b);// Division :: returns quotient
		System.out.println(a % b);// Modulus :: returns remainder

		System.out.println("Precedence Rule");
		System.out.println("BODMAS ---> Bracket OrderOfPower Division Multiplication Addition Subtraction");
		System.out.println("-----------------------------------");
		System.out.println("Program2");

		int a2 = 5 + 3 - 2 * 6 / 3;
		System.out.println(a2);

	}

}
