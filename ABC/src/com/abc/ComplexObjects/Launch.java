package com.abc.ComplexObjects;

import java.util.ArrayList;
import java.util.Collections;

public class Launch {

	public static void main(String[] args) {

		Student r=new Student("Ronaldo",100,98,99.0f);
		Student m=new Student("Messi",98,89,93.5f);
		Student b=new Student("Bale",125,86,116.5f);
		
		ArrayList al = new ArrayList();
		al.add(m);
		al.add(r);
		al.add(b);
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);//ClassCastException
		/* ClassCastException :: occurs because the object which is needs to be sorted 
		 * should implement <Comparable>(interface) 
		 */
	}

}
