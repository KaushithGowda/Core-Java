package com.abc.multithreading6;

public class Launch {

	public static void main(String[] args) {

		MsWord ms1 = new MsWord();
		MsWord ms2 = new MsWord();
		MsWord ms3 = new MsWord();
		
		ms1.setName("TYPE");
		ms2.setName("SPELLCHECK");
		ms3.setName("AUTOSAVE");
		
		//race condition
		//solution to race condition is daemon thread
		
		//a thread can be converted to daemon thread by following three steps
		//1.setting the threads to daemon thread as true
		ms2.setDaemon(true);
		ms3.setDaemon(true);
		
		//2.setting the priority of threads greater than main thread(5) 
		//hence subsidary threads will follow the main threads
		ms2.setPriority(8);
		ms3.setPriority(9);
		
		//3.keeping the subsidary threads in infinite loop
		ms1.start();
		ms2.start();
		ms3.start();
				
	}
	
}
