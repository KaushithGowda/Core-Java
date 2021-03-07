package com.abc.object.oriented;

public abstract class Shape {
 
	float area;
	
	abstract void acceptInput();
	abstract void compute();
	
	public void disp()
	{
		System.out.println("Area:" +area);
	}

}
