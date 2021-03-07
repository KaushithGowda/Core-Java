package com.abc.ComplexObjects.Comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Launch {

	public static void main(String[] args) {

		Student r=new Student("Ronaldo",100,98,99.0f);
		Student m=new Student("Messi",98,89,93.5f);
		Student b=new Student("Bale",125,86,116.5f);
		
		ArrayList al = new ArrayList();
		al.add(r);
		al.add(m);
		al.add(b);
		System.out.println(al);
		Alpha a=new Alpha();
		Collections.sort(al,a);
		System.out.println(al);
	}

}
