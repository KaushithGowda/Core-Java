package com.abc.multithreading9;

public class Launch {

	public static void main(String[] args) throws Exception{

		BathRoom b = new BathRoom();
		
		Thread boy = new Thread(b);
		Thread girl = new Thread(b);
		Thread other = new Thread(b);
		
		boy.setName("BOY");
		girl.setName("GIRL");
		other.setName("OTHER");
		
		/*1.Thread scheduler hands are let free
		//2.only 1 thread is executing at a time*/ 
		
		boy.start();
		
		girl.start();
	
		other.start();
		
		
	}

}
