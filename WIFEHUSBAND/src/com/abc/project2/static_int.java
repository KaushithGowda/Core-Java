package com.abc.project2;

public class static_int {
	
	static int a;
	static int b;
	static int c;
	static int d;

	//initialization
	static
	{
		a=10;
		b=20;
		c=30;
		d=40;
	}

	//display
	static void disp1()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}

}
