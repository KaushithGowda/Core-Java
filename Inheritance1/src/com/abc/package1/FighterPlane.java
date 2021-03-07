package com.abc.package1;

public class FighterPlane extends Plane {
	 //overridden method
		void fly()
		{
			System.out.println("FighterPlane flies at longer height");
		}
		
		void land()
		{
			System.out.println("FighterPlane lands at longer runs");
		}
		
		void takeOff()
		{
			System.out.println("FighterPlane takesOff at longer runs");
		}
		
		//specialised method
		void carry()
		{
			System.out.println("Carrying arms");
		}
}
