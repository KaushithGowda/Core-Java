package com.abc.multithreading11;

public class Launch {

		public static void main(String[] args) {

			Warrior w1 = new Warrior();
			Warrior w2 = new Warrior();
			
			w1.setName("RAMA");
			w2.setName("RAVANA");
			
			w1.start();
			w2.start();
	}

}
