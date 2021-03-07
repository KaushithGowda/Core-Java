package com.abc.non.object.oriented;

import java.util.Scanner;

public class Circle {
	
	float area;
	float radius;
	
	void acceptInput()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Circle radius");
		radius=scan.nextFloat();
	}
	
	void compute()
	{
		area=3.142f*radius*radius;
	}
	
	void disp()
	{
		System.out.println("The area of Circle is: " + area);
	}

}
