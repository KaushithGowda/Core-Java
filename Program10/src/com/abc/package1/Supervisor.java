package com.abc.package1;

public final class Supervisor {
  Worker w = new Worker();
  
     void sweep() {
         w.sweep();
     }
	 
	 void wash() {
	     w.wash();
	 }
	 
	 void dust() {
	     w.dust();
	 }
}
