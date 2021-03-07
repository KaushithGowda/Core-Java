package com.abc.object.oriented;

import java.util.Scanner;

public class Circle extends Shape {
	
	private float radius;

	public void acceptInput()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the Radius of the Circle");
		radius = scan.nextFloat();
	}
	
	public void compute()
	{
		area = 3.142f*radius*radius;
	}
	
}
