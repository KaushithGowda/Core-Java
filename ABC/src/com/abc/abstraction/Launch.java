package com.abc.abstraction;

public class Launch {

	public static void main(String[] args) {

		Airport a = new Airport();
		
		CargoPlane cp = new CargoPlane();
		a.permit(cp);
		
		PassengerPlane pp = new PassengerPlane();
		a.permit(pp);
		
		FighterPlane fp = new FighterPlane();
		a.permit(fp);
		
	}

}
