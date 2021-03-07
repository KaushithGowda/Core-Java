package com.abc.multithreading.producer.consumer.solution;

public class Launch {

	public static void main(String[] args) {

		Queue q = new Queue();
		Producer p = new Producer(q);
		Consumer c = new Consumer(q);
		p.start();
		c.start();
		
	}

}