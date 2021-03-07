package com.abc.package1;

	public class Airport {
		//Flexiable polymorphic way
		public void permit (Plane ref)
		{
			ref.fly();
			ref.land();
			ref.takeOff();
			ref.carry();
		}

	}


