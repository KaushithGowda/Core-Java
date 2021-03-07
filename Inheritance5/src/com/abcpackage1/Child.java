package com.abcpackage1;

public class Child extends Parent {
  //int i = 100; this i is separate variable (not overridden parent i)
  //i=10; this tag is trying to overide the parent i which is not possible
  void disp()
  {
	  //to access i present in the parent
	 System.out.println(super.i);
	 System.out.println(i);//present class i
  }
}
