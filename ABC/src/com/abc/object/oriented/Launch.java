package com.abc.object.oriented;

public class Launch {

	public static void main(String[] args) {

		Maths m = new Maths();
		Rectangle r = new Rectangle();
    	Sqauare s = new Sqauare();
    	Circle c = new Circle();
    	
    	m.permit(r);
    	m.permit(s);
    	m.permit(c);
	}

}
