package com.abc.collections.TreeMap;

import java.util.TreeMap;

public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 = new Student("Kohli",18,35,74,90);
		Student s2 = new Student("Pujara",14,15,14,17);
		Student s3 = new Student("Rahul",1,20,114,54);
		Student s4 = new Student("Dravid",19,37,14,117);
		
		TreeMap tm = new TreeMap();
		tm.put(18, s1);
		tm.put(14, s2);
		tm.put(1, s3);
		tm.put(19, s4);
		System.out.println(tm);
	}

}
