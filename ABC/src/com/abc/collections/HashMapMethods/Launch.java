package com.abc.collections.HashMapMethods;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import com.abc.collections.Map.Student;

public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 = new Student("Kohli",18,35,74,90);
		Student s2 = new Student("Pujara",14,15,14,17);
		Student s3 = new Student("Rahul",1,20,114,54);
		Student s4 = new Student("Dravid",19,37,14,117);
		
		HashMap hm = new HashMap();
		hm.put(18, s1);
		hm.put(14, s2);
		hm.put(1, s3);
		hm.put(19, s4);
		//keySet() :: will give out oly key 
		Set s = hm.keySet();
		Iterator itr = s.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//values() :: values will give out values
		Collection c = hm.values();
		Iterator itr2 = c.iterator();
		
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}
		
	}

}
