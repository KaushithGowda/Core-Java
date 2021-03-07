package com.abc.interfaces.rules;

import java.util.Scanner;

interface Connection{
	void add();
	void sub();
}

class Oracle implements Connection
{
	public void add()
	{
		int a, b, c;
		a=10;
		b=20;
		c=a+b;
		System.out.println(c);
	}
	
	public void sub()
	{
		int a, b, c;
		a=10;
		b=20;
		c=a-b;
		System.out.println(c);
	}
}

class Sybase implements Connection
{
	public void add()
	{
		int a, b, c;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the values of  a: ");
		a = scan.nextInt();
		System.out.println("enter the values of  b: ");
		b = scan.nextInt();
	    c = a+b;
	    System.out.println(c);
	}
	
	public void sub()
	{
		int a, b, c;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the values of  a: ");
		a = scan.nextInt();
		System.out.println("enter the values of  b: ");
		b = scan.nextInt();
		c = a-b;
		System.out.println(c);
	}
}
class AllowConnection
{
	void allowDBConnection(Connection ref)
	{
		ref.add();
		ref.sub();
	}
}
public class Launch {

	public static void main(String[] args) 
	{

		Oracle o = new Oracle();
		Sybase s = new Sybase();
	    AllowConnection ac = new AllowConnection();
	    ac.allowDBConnection(o);
	    ac.allowDBConnection(s);
	}

}
