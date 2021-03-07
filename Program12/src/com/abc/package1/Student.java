package com.abc.package1;

public class Student {

     Heart h = new Heart("Grey",76);
	 Brain b = new Brain(17);
	 
	 public void hasA(Book b)
	 {
		 System.out.println(b.getName());
	 }
	 public void hasA(Bike b)
	 {
		 System.out.println(b.getbrand());
		 System.out.println(b.getmileage());
	 }
}
