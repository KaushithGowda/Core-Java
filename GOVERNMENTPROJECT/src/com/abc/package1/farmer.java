package com.abc.package1;

import java.util.Scanner;

public class farmer
{
	
private float si;
private float p;
private float t;
private static float r=2.5f;

void acceptInput()
{
	Scanner scan = new Scanner(System.in);
	System.out.println("enter the principal amount");
	p=scan.nextFloat();
	System.out.println("enter the time");
	t=scan.nextFloat();
	r=2.5f;
}


void compute()
{
	si=(p*t*r)/100;
}

void disp()
{
	System.out.println(si);
	
}
}

