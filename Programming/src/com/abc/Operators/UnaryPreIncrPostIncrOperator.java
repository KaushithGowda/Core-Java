package com.abc.Operators;
//27-01-2021 12pm
public class UnaryPreIncrPostIncrOperator {

	public static void main(String[] args) {

		System.out.println("-----------");

		System.out.println("Program1");
		int a1 = 7;
		int b1 = a1++;//post-increment
		System.out.println(a1);//8
		System.out.println(b1);//7

		System.out.println("-----------");
		
		System.out.println("Program2");
		int a2 = 7;
		int b2 = ++a2;//pre-increment
		System.out.println(a2);//8
		System.out.println(b2);//8
		
		System.out.println("-----------");
		
		System.out.println("Program3");
		int a3 = 7;
		int b3 = a3++ + a3++;
		System.out.println(a3);
		System.out.println(b3);

		System.out.println("-----------");
	
		System.out.println("Program4");
		int a4 = 7;
		int b4;
		b4 = ++a4 + ++a4;
		System.out.println(a4);
		System.out.println(b4);
	
		System.out.println("-----------");
		
		System.out.println("Program5");
		int a5 = 7;
		int b5;
		b5 = ++a5 + a5++;
		System.out.println(a5);
		System.out.println(b5);
		
		System.out.println("-----------");
		
		System.out.println("Program6");
		int a6 = 7;
		int b6;
		b6 = --a6 - ++a6 + a6++ + --a6 + a6-- + a6-- - ++a6 + a6++ - a6-- + a6++ - ++a6 + a6++ - --a6 + a6-- - a6++ + --a6 - a6-- + a6++;
		System.out.println(a6);
		System.out.println(b6);
		
		System.out.println("-----------");
		
		System.out.println("Program7");
		int a7 = 7;
		int b7;
		b7 = a7++ + ++a7 - ++a7 + a7++ - --a7 + a7++ - a7-- + a7++ - --a7 + a7++ + a7++ - --a7 + a7-- + a7++;
		System.out.println(a7);
		System.out.println(b7);
		
		System.out.println("-----------");
		
		System.out.println("Program8");
		
		int a8 = 7;
		int b8;
		b8 = a8++ + ++a8;
		System.out.println(a8);
		System.out.println(b8);
		System.out.println("-----------");
	
	}

}
