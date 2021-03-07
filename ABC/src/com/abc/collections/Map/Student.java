package com.abc.collections.Map;

public class Student {

	String name;
	int jerseyNumber;
	int score1;
	int score2;
	int score3;
	/**
	 * @param name
	 * @param jerseyNumber
	 * @param score1
	 * @param score2
	 * @param score3
	 */
	public Student(String name, int jerseyNumber, int score1, int score2, int score3) {
		super();
		this.name = name;
		this.jerseyNumber = jerseyNumber;
		this.score1 = score1;
		this.score2 = score2;
		this.score3 = score3;
	}
	public String getName() {
		return name;
	}
	public int getJerseyNumber() {
		return jerseyNumber;
	}
	public int getScore1() {
		return score1;
	}
	public int getScore2() {
		return score2;
	}
	public int getScore3() {
		return score3;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", jerseyNumber=" + jerseyNumber + ", score1=" + score1 + ", score2=" + score2
				+ ", score3=" + score3 + "]";
	}
	
	
	
}
