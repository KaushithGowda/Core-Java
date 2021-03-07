package com.abc.multithreading5;

public class Launch {

	public static void main(String[] args) {

		MsWord ms1 = new MsWord();
		MsWord ms2 = new MsWord();
		MsWord ms3 = new MsWord();
		
		ms1.setName("TYPE");
		ms2.setName("SPELLCHECK");
		ms3.setName("AUTOSAVE");
		
		//race condition
		ms1.start();
		ms2.start();
		ms3.start();
		
		//solution to race condition is daemon thread
	}

}
