package com.abcpackage1;

public class Child extends Parent {
	//JVM Checks for static members and executes orderwise
	//1.static variable
	//2.static block 
	
	static int b = 200;
	
	static
	{
		System.out.println("Inside first child static block");//4
	}
	
	static
	{
		System.out.println("Inside second child static block");//5
		disp2();
	}
	
	static void disp2()
	{
		System.out.println(b);//200----6
	}
	
	public static void main(String[] args) {

		System.out.println("Inside main method of Child");//7
	}
//	void dispInChild()
//	{
//	System.out.println(a);	
//	}
	
	//this is not overidden method of parent 
	//this is a separate class
	//static method will never get inheritted
//	static void dispInParent()
//	{
//	System.out.println("HI");
//	}
	
}
