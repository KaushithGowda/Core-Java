package com.abc.serialization;

public class Cricketer {

	String name;
	int runs;
	float avg;
	float strikeRate;
	/**
	 * @param name
	 * @param runs
	 * @param avg
	 * @param strikerate
	 */
	public Cricketer(String name, int runs, float avg, float strikeRate) {
		super();
		this.name = name;
		this.runs = runs;
		this.avg = avg;
		this.strikeRate = strikeRate;
	}
	
	public void disp()
	{
		System.out.println(name);
		System.out.println(runs);
		System.out.println(avg);
		System.out.println(strikeRate);
	}
		

}
