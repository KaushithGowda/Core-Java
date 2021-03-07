package com.abc.Operators;
//28-01-2021
public class ShiftOperators {

	public static void main(String[] args) {

		System.out.println("-----------------------------------------------------------------------");
		System.out.println("Program1");
		System.out.println("Left Shift");
		
		byte a1  = 7;
		System.out.println(a1);//7 ---> 0000 0111
		System.out.println(a1 << 2);//28 ---> 0001 1100
		
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("Program2");
		System.out.println("Right Shift");
		
		byte a2  = 7;
		System.out.println(a2);//7 ---> 0000 0111
		System.out.println(a2 >> 2);//1 ---> 0000 0001
		
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("Program3");
		System.out.println("Right Shift");
		System.out.println("Decresing /2");
		
		byte a3 = 64;
		System.out.println(a3 >> 1);
		System.out.println(a3 >> 2);
		System.out.println(a3 >> 3);
		System.out.println(a3 >> 4);
		System.out.println(a3 >> 5);
		
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("Program4");
		System.out.println("Left Shift");
		System.out.println("Incresing *2");
		
		byte a4 = 1;
		System.out.println(a4 << 1);
		System.out.println(a4 << 2);
		System.out.println(a4 << 3);
		System.out.println(a4 << 4);
		System.out.println(a4 << 5);

		System.out.println("-----------------------------------------------------------------------");
	}

}
