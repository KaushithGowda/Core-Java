package com.abc.interfaces;

interface Compute
{
	void add();
	void sub();
}


interface AdvCompute extends Compute
{
	void mul();
	void div();
}

class Calculator implements AdvCompute //RULE 5
{
	public void add()//RULE 6
	{
		int a,b,c;
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
	
	public void mul()
	{
		int a, b, c;
		a=10;
		b=20;
		c=a*b;
		System.out.println(c);
	}
	
	public void div() 
	{
		float a, b, c;
		a=10;
		b=20;
		c=a/b;
		System.out.println(c);
	}
}
public class Launch {

	public static void main(String[] args) {
 
//		Compute ptr = new Compute();//error  //RULE1
		Compute ptr;//RULE 2
		AdvCompute advptr;//RULE 2
	
		Calculator c = new Calculator();
		
		c.add();
		c.sub();
		c.mul();
		
		ptr = c;//RULE7
		advptr = c;//RULE7
		ptr.add();
		ptr.sub();
		((Calculator)(ptr)).mul();
		advptr.div();
		advptr.mul();
		
	}

}
