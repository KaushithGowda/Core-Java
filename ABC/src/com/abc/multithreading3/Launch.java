package com.abc.multithreading3;

public class Launch {

	/*whenever main method is called, a main stack is created in stack 
	and main method is placed in it. */
	
	/*two ways in which extra stack can be created
	 * 1.whenever an object is created of the class, which is extending thread class. 
	 *   Then an extra stack is created in bigger stack and then we need to
	 *   call start using that class object.
     * 2.we can create object of thread class directly to create extra stack and pass 
	 *   ref of other class in thread object and call start using that thread object.*/

	
	public static void main(String[] args) {

		Demo1 d1 = new Demo1();
		Demo2 d2 = new Demo2();
		Demo3 d3 = new Demo3();
	
		Thread t1= new Thread(d1);
		Thread t2= new Thread(d2);
		Thread t3= new Thread(d3);
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
