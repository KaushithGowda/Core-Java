package com.abc.non.object.oriented;

import java.util.Scanner;

public class Square {

	float area;
	float length;

	void acceptInput()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Square length");
		length=scan.nextFloat();
	}
	
	void compute()
	{
		area=length*length;
	}
	
	void disp()
	{
		System.out.println("The area of Square is: " + area);
	}
}
