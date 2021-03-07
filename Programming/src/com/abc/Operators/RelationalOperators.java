package com.abc.Operators;
//27-01-2021 12pm
public class RelationalOperators {

	public static void main(String[] args) {

		System.out.println("-----------------");
		System.out.println("Program1");
		System.out.println("Lesser than Operator");
		
		int a1 = 10;
		boolean b1 = a1 < 20;
		System.out.println(b1);
		
		System.out.println("-----------------");
		System.out.println("Program2");
		System.out.println("Greater than Operator");
		
		int a2 = 10;
		boolean b2 = a2 > 20;
		System.out.println(b2);
		
		System.out.println("-----------------");
		System.out.println("Program3");
		System.out.println("Greater than or equal to Operator");
		
		int a3 = 10;
		boolean b3 = a3 >= 10;
		System.out.println(b3);
		
		System.out.println("-----------------");
		System.out.println("Program4");
		System.out.println("Lesser than or equal to Operator");
		
		int a4 = 10;
		boolean b4 = a4 <= 11;
		System.out.println(b4);
		
		System.out.println("-----------------");
		System.out.println("Program5");
		System.out.println("Greater than or equal to Operator");
		
		int a5 = 10;
		boolean b5 = a5 >= 11;
		System.out.println(b5);
		
		System.out.println("-----------------");
		System.out.println("Program6");
		System.out.println("Strict equal to Operator");
		
		int a6 = 10;
		boolean b6 = a6 == 10;
		System.out.println(b6);
		
		System.out.println("-----------------");
		System.out.println("Program7");
		System.out.println("Not equal to Operator");
		
		int a7 = 10;
		boolean b7 = a7 != 10;
		System.out.println(b7);
	
		System.out.println("-----------------");
		
		/*
		Assignment
		int a = 10;
		int b = a==10;// error :: return type of relational operator is boolean
		String b = a==10;// error :: return type of relational operator is boolean
		System.out.println(b);
		*/
		
	}

}
