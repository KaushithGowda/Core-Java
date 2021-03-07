package com.abc.Operators;
//27-01-2021 12pm
public class UnaryPlusMinusOperator {

	public static void main(String[] args) {

		System.out.println("Unary Plus and Minus operator");
		System.out.println("--------------");
		
		System.out.println("Program1");
		int a1 = 10;
		System.out.println(a1);
		a1 = -a1;
		System.out.println(a1);

		System.out.println("--------------");
		
		System.out.println("Program2");
		int a2 = 10;
		System.out.println(a2);
		a2 = +a2;
		System.out.println(a2);

		System.out.println("--------------");
		
		System.out.println("Program3");
		int a3 = -10;
		System.out.println(a3);
		a3 = +(-10);
		System.out.println(a3);
		
		System.out.println("--------------");
		
		System.out.println("Program4");
		int a4 = -10;
		System.out.println(a4);
		a4 = -(-10);
		System.out.println(a4);
	}

}
