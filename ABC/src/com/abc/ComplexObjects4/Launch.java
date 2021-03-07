package com.abc.ComplexObjects4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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

		//as there is no alpha object removing alpha class
	
	//making the project more encapsulated
	//removing label so that neighbour does not know the toilet
	//Alpha a=new Alpha();
	//passing Comparator() as other object for sorting
	Collections.sort(al,new Comparator(){
		
		public int compare(Object x, Object y) {
			if(((Student)(x)).marks2>((Student)(y)).marks2){
				return 1;
			} else {
				return -1;
			}
		}
	});
	System.out.println(al);
	}		
}


