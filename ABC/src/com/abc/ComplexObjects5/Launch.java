package com.abc.ComplexObjects5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Launch {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add(200);
		al.add(390);
		al.add(765);
		al.add(675);
		al.add(890);
		al.add(50);
		System.out.println(al);
		//Collections.sort(al);//gives out ascending order
		//Collections.reverse(al);//reverses the sorted output. So the output will be descending order.
		/* Collections.sort by default will sort in ascending order 
		 * expection is getting descending order by using sort()
		 * using inbuilt method Collections.reverseOrder() and then passing this as parameter in sort()
		 */
		//Comparator c=Collections.reverseOrder();
		//Collections.sort(al,c);
		System.out.println(al);
		//some imp methods of Collections Class
		System.out.println(Collections.binarySearch(al,390));
		System.out.println(al);
		//rotate the al as per requirements
		Collections.rotate(al, 1);
		System.out.println(al);
		//max value method
		System.out.println(Collections.max(al));
		//min value method
		System.out.println(Collections.min(al));
		
		ArrayList al2 = new ArrayList();
		al2.add(200);
		al2.add(390);
		al2.add(765);
		al2.add(390);
		al2.add(675);
		al2.add(390);
		al2.add(890);
		al2.add(50);
		al2.add(890);
		System.out.println(al2);
		//frequency() refers to no of times object repeated
		System.out.println(Collections.frequency(al2,390));
		//replaceAll(obj,oldvalue,newvalue):: replaces  
		Collections.replaceAll(al2, 390, 490);
		System.out.println(al2);
		//shuffle():: shuffles the objects
		Collections.shuffle(al2);
		System.out.println(al2);
	}

}
