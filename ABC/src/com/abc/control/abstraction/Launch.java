package com.abc.control.abstraction;

public class Launch {

	public static void main(String[] args) {

		GoldenEagle ge = new GoldenEagle();
		ge.eat();
		ge.fly();
		
		SerpentEagle se = new SerpentEagle();
		se.eat();
		se.fly();
		
		VegSparrow vs = new VegSparrow();
		vs.eat();
		vs.fly();
		
		NonVegSparrow nvs = new NonVegSparrow();
		nvs.eat();
		nvs.fly();
		
	}

}
