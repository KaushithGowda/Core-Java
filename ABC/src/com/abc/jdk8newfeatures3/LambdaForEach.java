package com.abc.jdk8newfeatures3;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaForEach {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		al.add(500);
		
		//optional datatype
//		Consumer c = (Object o)->{
		//optional params braces
//			Consumer c = o->{
		//optional body braces
//				Consumer c = o->System.out.println(o);
		
		//leaving behind optional values
		al.forEach(o->System.out.println(o));
	}

}
