package com.abc.abstraction;

public class CargoPlane extends Plane{
	
	void fly()
	{
		System.out.println("CargoPlane flies at medium heights");
	}
	
	void land()
	{
		System.out.println("CargoPlane lands in medium runways");
	}

	void takeOff()
	{
		System.out.println("CargoPlane takes off at medium runways");
	}
}
