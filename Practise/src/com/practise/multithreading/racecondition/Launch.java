package com.practise.multithreading.racecondition;

public class Launch {

	public static void main(String[] args) {

		MsWorld ms1= new MsWorld();
		MsWorld ms2= new MsWorld();
		MsWorld ms3= new MsWorld();
		ms1.setName("TYPE");
		ms2.setName("SPELLCHECK");
		ms3.setName("AUTOSAVE");
		ms1.start();
		ms2.start();
		ms3.start();
		
	}

}
