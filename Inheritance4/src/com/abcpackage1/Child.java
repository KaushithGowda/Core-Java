package com.abcpackage1;

public class Child extends Parent{
	//JVM preferences
	//main method
	//object creation
	//instance variable assigned
	//non static block of this class
	//constructor block
	//disp2
	
	int b=100;
	
	{
		System.out.println("Inside non-static block of child");
		disp2();
	}
	
	void disp2()
	{
		System.out.println(b);
	}
	
	public Child()
	{
		System.out.println("Inside child class constructor");
	}
	
	public static void main(String[] args) {
	  	System.out.println("Inside main method of child");//1
	  	Child c = new Child();//2
	}

}
