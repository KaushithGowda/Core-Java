package com.abcpackage1;

public class PassengerPlane extends Plane
{
	//overridden method
	void fly()
	{
		System.out.println("PassengerPlane flies at lower height");//overridden method is printed 
	}
	
	void land()
	{
		System.out.println("PassengerPlane lands at lower runs");
	}
	
	void takeOff()
	{
		System.out.println("PassengerPlane takesOff at lower runs");
	}
	
	//specialised method
	void carryPassenger()
	{
		System.out.println("Carrying Passengers");
	}

}
