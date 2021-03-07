package com.abc.non.object.oriented;

import java.util.Scanner;

public class Rectangle {

	float area;
	float length;
	float breadth;

	void acceptInput()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Rectangle length");
		length=scan.nextFloat();
		System.out.println("Enter the Rectangle breadth");
		breadth=scan.nextFloat();
	}
	
	void compute()
	{
		area=length*breadth;
	}
	
	void disp()
	{
		System.out.println("The area of Rectangle is: " + area);
	}
}
