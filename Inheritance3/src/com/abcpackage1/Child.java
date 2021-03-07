package com.abcpackage1;

public class Child extends Parent {
	int c;
	int d;
	
	public Child()
	{
		c=30;
		d=40;
	}
	
	public Child(int m, int n)
	{
		super();
		c=m;
		d=n;
	}
	
	void disp()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}

}
