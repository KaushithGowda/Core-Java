package com.abc.package1;

public class CargoPlane extends Plane{
    //overridden method
		void fly()
		{
			System.out.println("CargoPlane flies at medium height");
		}
		
		void land()
		{
			System.out.println("CargoPlane lands at medium runs");
		}
		
		void takeOff()
		{
			System.out.println("CargoPlane takesOff at medium runs");
		}
		
		//specialised method
		void carry()
		{
			System.out.println("Carrying goods");
		}
}
