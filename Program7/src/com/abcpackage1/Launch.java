package com.abcpackage1;

public class Launch {

	public static void main(String[] args) {
	
	  //Upcasting //Implicit
      Child c1 = new Child();
      Parent p1;
      p1=c1;
      
      //Downcasting //Explicit
      Parent p2 = new Parent();
      Child c2;
      c2=((Child)(p2));
      
	}

}
