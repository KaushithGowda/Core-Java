package com.abc.Operators;
//27-01-2021 12pm
public class UnaryNegationOperator {

	public static void main(String[] args) {

		System.out.println("Unary Negation operator");
		System.out.println("Formula of negation operator = (-(<value>)-1)");
		System.out.println("-----------");
		
		System.out.println("Program1");
		int a1 = 10;
		System.out.println(a1);
		a1=~a1;
		System.out.println(a1);

		System.out.println("-----------");
		
		System.out.println("Program2");
		int a2 = -10;
		System.out.println(a2);
		a2=~a2;
		System.out.println(a2);

	}

}
