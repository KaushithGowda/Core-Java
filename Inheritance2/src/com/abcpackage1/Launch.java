package com.abcpackage1;

public class Launch {

	public static void main(String[] args)
	{
	
		Dog d = new Dog();
		d.eats();
		d.sleeps();
		d.runs();
		d.barks();
		
	    Lion l = new Lion();
		l.eats();
		l.sleeps();
		l.runs();
		l.raps();
		
		Tiger t = new Tiger();
		t.eats();
		t.sleeps();
		t.runs();
		t.chills();
		
		//Object casting
		
		//Upcasting
		Dog o = new Dog();
		Animal a;
		a=o;//converting from child to parent ---> UPCASTING
		a.eats();
		a.sleeps();
		a.runs();
		//a.barks();//error//cannot access specialised method using polymorphism
		
		//Downcasting
		Animal b = new Animal();
		Lion n;
		n=((Lion)(b));//converting from parent to child ---> DOWNCASTING
		n.eats();
		n.raps();
		n.runs();
		n.sleeps();
		
		
		
	}

}
