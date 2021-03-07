package com.abc.Operators;
//27-01-2021 12pm
public class UnaryNotOperator {

	public static void main(String[] args) {

		System.out.println("Unary Not operator");
		System.out.println("-------------");
		
		System.out.println("Program1");
		boolean a1 = true;
		System.out.println(a1);
		a1 = !a1;
		System.out.println(a1);

		System.out.println("-------------");
		System.out.println("Program2");
		boolean a2 = false;
		System.out.println(a2);
		a2 = !a2;
		System.out.println(a2);
		
		/*
		Assignment :: 
		boolean a = false; // error :: return type of unaryNotOperator is boolean
		boolean b = !a; // error :: return type of unaryNotOperator is boolean
		String b = false; // error :: return type is boolean
		int b = false; // error :: return type is boolean
		float b = false; // error :: return type is boolean
		System.out.println(a);
		System.out.println(b);
		*/
 		
	}

}
