package com.abc.multithreading7;

public class Launch {

	

		/*whenever main method is called, a main stack is created in stack 
		and main method is placed in it. */
		
		/*two ways in which extra stack can be created
		 * 1.whenever an object is created of the class, which is extending thread class. 
		 *   Then an extra stack is created in bigger stack and then we need to
		 *   call start using that class object.
	     * 2.we can create object of thread class directly to create extra stack and pass 
		 *   ref of other class in thread object and call start using that thread object.*/

		
		public static void main(String[] args) throws Exception {

			System.out.println("main thread started its execution");
			Demo1 d1 = new Demo1();
			Demo2 d2 = new Demo2();
			Demo3 d3 = new Demo3();
		
			d1.start();
			//d1.isAlive returns wheather the thread is alive
			System.out.println(d1.isAlive());//true
			d1.join();
			System.out.println(d1.isAlive());//false

			d2.start();
			d2.join();
			System.out.println(d1.isAlive());//false
			
			d3.start();
			d3.join();
			System.out.println(d3.isAlive());//false
			
			System.out.println("main thread finished its execution");
			
		}
}


