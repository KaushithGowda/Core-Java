package com.abc.Operators;
//27-01-2021 12pm
public class LogicalOperators {

	public static void main(String[] args) {

		System.out.println("-----------------------------------------------");
		System.out.println("Program1");
		System.out.println("LogicalAND Operator");

		boolean a1 = true;
		boolean b1 = false;
		boolean c1 = a1 && b1;
		System.out.println(c1);
	
		System.out.println("-----------------------------------------------");
		System.out.println("Program2");
		System.out.println("LogicalAND Operator");
		
		int a2 = 20;
		int b2 = 10;
		boolean c2 = (a2+b2) > 50 && (a2-b2) < 50;
		System.out.println(c2);
	
		System.out.println("-----------------------------------------------");
	
		System.out.println("Program3");
		System.out.println("LogicalOR Operator");
		
		boolean a3 = true;
		boolean b3 = false;
		boolean c3 = a3 || b3;
		System.out.println(c3);
		
		System.out.println("-----------------------------------------------");
		System.out.println("Program4");
		System.out.println("LogicalOR Operator");
	
		int a4 = 20;
		int b4 = 10;
		boolean c4 = (a4+b4) > 50 || (a4-b4) < 50;
		System.out.println(c4);
	
		System.out.println("-----------------------------------------------");

		/*
		Assignment
		boolean a = true;
		boolean b = true;
		String c = a && b;// error :: return type of logicalOperator is boolean
		int c = a && b;// error :: return type of logicalOperator is boolean
		float c = a && b;// error :: return type of logicalOperator is boolean
		System.out.println(c);
		*/
	}
}
