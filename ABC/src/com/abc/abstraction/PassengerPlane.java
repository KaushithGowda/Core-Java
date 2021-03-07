package com.abc.abstraction;

public class PassengerPlane extends Plane{

	void fly()
	{
		System.out.println("PassengerPlane flies at lower heights");
	}
	
	void land()
	{
		System.out.println("PassengerPlane lands at lower runways");
	}
	
	void takeOff()
	{
		System.out.println("PassengerPlane takes off at lower runways");
	}
}

