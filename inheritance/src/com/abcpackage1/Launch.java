package com.abcpackage1;

public class Launch {

	public static void main(String[] args) 
	{
    //normal method calling 
    PassengerPlane pp = new PassengerPlane();
    pp.takeOff();
    pp.land();
    pp.fly();
    pp.carryPassenger();
    
    //normal method calling 
    CargoPlane cp = new CargoPlane();
    cp.takeOff();
    cp.land();
    cp.fly();
    cp.carryGoods();
       
    //normal method calling 
    FighterPlane fp = new FighterPlane();
    fp.takeOff();
    fp.land();
    fp.fly();
    fp.carryArms();
    
	}

}
