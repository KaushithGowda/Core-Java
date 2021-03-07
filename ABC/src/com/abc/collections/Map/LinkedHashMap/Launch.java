package com.abc.collections.Map.LinkedHashMap;

//29-12-2020
//LinkedHashMap
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Student s1 = new Student("Kohli",18,35,74,90);
			Student s2 = new Student("Pujara",14,15,14,17);
			Student s3 = new Student("Rahul",1,20,114,54);
			Student s4 = new Student("Dravid",19,37,14,117);
			
//			LinkedHashMap lhm = new LinkedHashMap();
			TreeMap lhm = new TreeMap();
			lhm.put(18, s1);
			lhm.put(14, s2);
			lhm.put(1, s3);
			lhm.put(19, s4);
			System.out.println(lhm);
	}

}
