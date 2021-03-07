package com.abc.multithreading.producer.consumer.solution;

public class Queue {


	int x;
	boolean valueInsideX=false;
	
	synchronized public void put(int in)
	{
		if( valueInsideX==true)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} else
		{
			x=in;
			System.out.println("producer produced the value "+ x);
			valueInsideX=true;
			notify();
		}
	}
	synchronized public void get()
	{
		if( valueInsideX==true)
		{
			System.out.println("consumer consumed the value "+ x);
			valueInsideX=false;
			notify();
		} else
		{
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
}
