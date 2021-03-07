package com.abcpackage1;

public class Parent {
	//JVM Checks for static members and executes orderwise
	//1.static variable
	//2.static block 
    static int a=100;
	
	static
	{
		System.out.println("Inside first parent static block");//1
	}
	
	static
	{
		System.out.println("Inside second parent static block");//2
		disp1();
	}
	
	static void disp1()
	{
		System.out.println(a);//3---100
	}
	
	public static void main(String[] args)
	{
		System.out.println("Inside main method of parent");//
	}
}
