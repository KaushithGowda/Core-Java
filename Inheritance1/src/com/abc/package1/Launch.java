package com.abc.package1;

public class Launch {
	
	public static void main(String[] args) 
	{
	//PassengerPlane pp = new PassengerPlane();
		//Flexiable way
		Airport a = new Airport();
		
	    CargoPlane cp = new CargoPlane();
	    a.permit(cp);
	    
	    PassengerPlane pp = new PassengerPlane();
	    a.permit(pp);
	    
	    FighterPlane fp = new FighterPlane();
	    a.permit(fp);
	    
		 //Polymorphic way
	    Plane ref2;
	    ref2=pp;
	    ref2.fly();
	    ref2.land();
	    ref2.takeOff();
	    ref2.carry();//cannot access specialised method by polymorphic way
	    
	    //CargoPlane cp = new CargoPlane();
	    //Polymorphic way
	    Plane ref;
	    ref=cp;
	    ref.fly();
	    ref.land();
	    ref.takeOff();
	    ref.carry();//cannot access specialised method by polymorphic way
	    
	    //FighterPlane fp = new FighterPlane();
	    //Polymorphic way
	    Plane ref1;
	    ref1=fp;
	    ref1.fly();
	    ref1.land();
	    ref1.takeOff();
	    ref1.carry();//cannot access specialised method by polymorphic way
	    
}
}