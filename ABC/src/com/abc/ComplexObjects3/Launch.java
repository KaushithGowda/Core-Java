package com.abc.ComplexObjects3;

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
	
	class Alpha implements Comparator{
		
		public int compare(Object x, Object y) {
			if(((Student)(x)).marks2>((Student)(y)).marks2){
				return 1;
			} else {
				return -1;
			}
		}
	}
	
		Alpha a=new Alpha();
		Collections.sort(al,a);
		System.out.println(al);
	}		
}
