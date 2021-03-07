package com.abc.multithreading4;

public class Launch {

	public static void main(String[] args) {

		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		MyThread t3 = new MyThread();
		t1.setName("BANK");
		t2.setName("PRINT");
		t3.setName("ADD");
		t1.start();
		t2.start();
		t3.start();
	}

}
