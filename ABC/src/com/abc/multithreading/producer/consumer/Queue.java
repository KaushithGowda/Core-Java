package com.abc.multithreading.producer.consumer;

public class Queue {

	int x;
	
	public void put(int in)
	{
		x=in;
		System.out.println("producer produced the value " +  x);
	}
	
	public void get()
	{
		System.out.println("consumer comsumed the value " + x);
	}
	
}
