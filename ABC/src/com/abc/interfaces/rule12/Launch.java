package com.abc.interfaces.rule12;

import java.util.Scanner;

interface Compute
{
	void sub();
}

class Calculator
{
	public void add()
	{
		
		int a, b, c;
		a=10;
		b=20;
		c=a+b;
		System.out.println(c);
		
	}
}

class AdvCompute extends Calculator implements Compute//orderwise 1.extends 2.implements //RULE12
{
	public void sub()
	{
		
		int a, b, c;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the value of a: ");
		a = scan.nextInt();
		System.out.println("enter the value of b: ");
		b = scan.nextInt();
		c=a-b;
		System.out.println(c);
		
	}
}
public class Launch {

	public static void main(String[] args) 
	{

		AdvCompute ac = new AdvCompute();
		ac.add();
		ac.sub();
		
	}

}
