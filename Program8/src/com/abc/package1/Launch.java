package com.abc.package1;

public class Launch {

	public static void main(String[] args) {
		Home h = new Home();
		
		Dog d = new Dog();
		h.permit(d);
		
		Tiger t = new Tiger();
		h.permit(t);

		Lion l = new Lion();
		h.permit(l);
	}

}
