package com.abc.jdk8newfeatures3;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ForEach {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		al.add(500);

		Consumer c = new Consumer(){

			@Override
			public void accept(Object o) {
				System.out.println(o);
			}
		};
		
		//forEach
		al.forEach(c);
	}

}
