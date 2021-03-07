package com.abc.ComplexObjects.Comparator;

import java.util.Comparator;

public class Alpha implements Comparator{
	
	public int compare(Object x, Object y) {
		if(((Student)(x)).marks2>((Student)(y)).marks2){
			return 1;
		} else {
			return -1;
		}
	}

}
