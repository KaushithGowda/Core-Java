package com.abc.multithreading8;

public class Launch {

	public static void main(String[] args) throws Exception{

		BathRoom b = new BathRoom();
		
		Thread boy = new Thread(b);
		Thread girl = new Thread(b);
		Thread other = new Thread(b);
		
		boy.setName("BOY");
		girl.setName("GIRL");
		other.setName("OTHER");
		
		/*Thread scheduler hands are tied
		We are controlling the threads which is wrong and We as programmers are not supposed to control threads. Only thread scheduler should control threads.
		So to make only one thread executing at a time and controlled by thread scheduler we should use synchronized keyword(ref: com.abc.multithreading9)*/
		
		/*In the below program join() method is pausiing the boy thread untill it is completely executed i.e controlling thread*/
		boy.start();
		boy.join();
		girl.start();
		girl.join();
		other.start();
		other.join();
		
	}

}
