package com.abc.abstraction;

public class FighterPlane extends Plane{

	void fly()
	{
		System.out.println("FighterPlane flies at higher heights");
	}
	
	void land()
	{
		System.out.println("FighterPlane lands at longer runways");
	}
	
	void takeOff()
	{
		System.out.println("FighterPlanetakes off at longer runways");
	}
}

