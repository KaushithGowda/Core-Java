package com.abc.object.oriented;

import java.util.Scanner;

public class Rectangle extends Shape{
	
	private float length;
	private float breadth;
	
	public void acceptInput()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the length of Rectangle:");
		length = scan.nextFloat();
		System.out.println("enter the breadth of Rectangle:");
		breadth = scan.nextFloat();
	}
	
	public void compute()
	{
		area = length*breadth;
	}
	
}
