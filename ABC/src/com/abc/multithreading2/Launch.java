package com.abc.multithreading2;

public class Launch {

	public static void main(String[] args) {

		Demo1 d1 = new Demo1();
		Demo2 d2 = new Demo2();
		Demo3 d3 = new Demo3();
		d1.start();
		d2.start();
		d3.start();
	
	}

}
