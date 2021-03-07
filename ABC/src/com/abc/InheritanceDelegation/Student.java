package com.abc.InheritanceDelegation;

public class Student extends Human {
      
	public void hasA(Book a)
	{
		System.out.println(a.getName());
	}
    
	public void hasA(Bike b)
	{
		System.out.println(b.brand);
		System.out.println(b.model);
		System.out.println(b.Hp);
	}
}

