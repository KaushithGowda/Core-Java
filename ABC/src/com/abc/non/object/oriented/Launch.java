package com.abc.non.object.oriented;

public class Launch {

	public static void main(String[] args) {

		Rectangle r = new Rectangle();
		r.acceptInput();
		r.compute();
		r.disp();
		
		Square s = new Square();
		s.acceptInput();
		s.compute();
		s.disp();
		
		Circle c = new Circle();
		c.acceptInput();
		c.compute();
		c.disp();
	}

}
