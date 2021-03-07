package com.abc.InheritanceDelegation;

public class Launch {

	public static void main(String[] args) {
        
		Human m = new Human();
		//Composition
		System.out.println("Brain Colour:"+m.b.colour);
		System.out.println("Brain weight:"+m.b.iq);
		System.out.println("Heart Colour:"+m.h.colour);
		System.out.println("Heart pulse:"+m.h.pulseRate);
		
		//Aggregation
		Bike x = new Bike("KTM","DUKE200",25);
		m.hasA(x);
		System.out.println("Bike Brand:"+x.getBrand());
		System.out.println("Bike Model:"+x.getModel());
		System.out.println("Bike Hp:"+x.getHp());
        
		Book y = new Book("Book:"+"Bhagavathgeetha");
		m.hasA(y);
		System.out.println(y.getName());
		
		//Human died due to a disease 
//		Human m = new Human();
//		m=null;
//		System.out.println("Brain Colour:"+m.b.colour);
//		System.out.println("Brain weight:"+m.b.iq);
//		System.out.println("Heart Colour:"+m.h.colour);
//		System.out.println("Heart pulse:"+m.h.pulseRate);
//		
//		Bike x = new Bike("KTM","DUKE200",25);
//		//m.hasA(x);
//		System.out.println("Bike Brand:"+x.getBrand());
//		System.out.println("Bike Model:"+x.getModel());
//		System.out.println("Bike Hp:"+x.getHp());
//        
//		Book y = new Book("Book:"+"Bhagavathgeetha");
//		//m.hasA(y);
//		System.out.println(y.getName());

		
	}

}
