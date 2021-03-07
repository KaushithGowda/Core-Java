package com.abc.abstraction;

public class Airport {
	public void permit (Plane ref)
	{
		ref.fly();
		ref.land();
		ref.takeOff();
	}

}
