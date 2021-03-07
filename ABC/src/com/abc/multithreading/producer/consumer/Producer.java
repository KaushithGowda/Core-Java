package com.abc.multithreading.producer.consumer;

public class Producer extends Thread {

	Queue a;
	
	public Producer(Queue q)
	{
		a=q;
	}
	
	public void run()
	{
		int i=1;
		while(true)
		{ 
		     a.put(i++);
		}
	}

}
