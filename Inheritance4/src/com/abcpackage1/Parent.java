package com.abcpackage1;

public class Parent {
	//default JVM preferences ---> static variable->blocks->methods
    //if object is not created nonstatic method will not be execute 
	//JVM preferences
		//main method
		//object creation
		//instance variable assigned
		//non static block of this class
	    //constructor block
		//disp1
		//-->child
	
    int a=100;
	
	{
		System.out.println("Inside non-static block of parent");//2
		disp1();
	}
	
	void disp1()
	{
		System.out.println(a);//100----->3
	}
	
	public Parent()
	{
		System.out.println("Inside parent class constructor");//4
	}
	
	public static void main(String[] args) {
		System.out.println("Inside main method of parent");
		Parent p= new Parent();
	}
	

}
