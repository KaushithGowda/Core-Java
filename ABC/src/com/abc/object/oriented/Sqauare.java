package com.abc.object.oriented;

import java.util.Scanner;

public class Sqauare extends Shape {

	private float length;
	
	public void acceptInput()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the Length of the Square");
		length = scan.nextFloat();
	}

	public void compute()
	{
		area = length*length;
	}
	
}
