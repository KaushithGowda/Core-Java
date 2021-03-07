package com.abc.serializationUID;

import java.io.Serializable;

public class Cricketer implements Serializable {


	String name;
	int runs;
	float avg;
	float strikeRate;
	private static final long serialVersionUID=11111;

	//we cannot alter the cricketer class in the destination side bcz java will know the differences
	//int noOfHundreds;
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
