package com.abcpackage1;

public class Launch {
	private static Child6 C62;

	public static void main(String[] args) {
   //Tight coupling
   //Child1 C1 = new Child1();
   //Child2 C2 = new Child2();
   //Child3 C3 = new Child3();
		
 //tight coupling
 //   C1.cry();
 //   C2.cry();
 //   C3.cry();
   
   //Loose coupling
   //parent ref is refering to all C1,C2,C3 and ref.cry()
   //ref:cry(diff result)
   //1:Many
   Parent ref;
  
   Child1 C1= new Child1();
   ref = C1;
   ref.cry();
   ((Child1)(ref)).eat();//indirect object casting //downcast
 //ref.eats();(error) //using parent type ref we cannot access specialized method
   //Using parent ref we can access inheritted method and overidden method but we cannot access specialised method
   //Using polymorphism we can access inherited and overridden method using parent reference.
   //but we can not access specialized method using parent reference directly 
   
   Child2 C2 = new Child2();
   ref = C2;
   ref.cry();
   ((Child2)(ref)).eat();//indirect object casting //downcast
 //ref.eats();(error)
   
   Child3 C3 = new Child3();
   ref = C3;
   ref.cry();
   ((Child3)(ref)).eat();//indirect object casting //downcast
 //ref.eats();(error)
   
   byte a=1;
   byte b=1;
   double c=(a+b);//explicit //done by programmer
   
   int x=100;
   double y;
   y=x;//Implicit //done by computer 
   
   //Object casting
   Child5 C5 = new Child5();
   Parent1 p1 = new Child5();
   //upcasting //pointing a Parent p4 to child type object. This is Implicit casting and is called object casting
   //Child5 C5 = new Parent();//error //cannot convert from Parent to Child5
   //downcasting pointing a child C5(ref) to parent type object. This is Explicit casting and is called object casting
   
   //Approach1
   Child6 C6 = new Child6();
   Parent2 p2;
   p2=C6;//converting from Child to Parent--->Upcasting
   
   //Approach2
   Parent3 p3 = new Parent3();
   Child7 C7;
   //C7=p3;//error //cannot convert directly from Parent to Child4--->Downcasting 
   
   //Approach3
   Parent4 p4= new Parent4();
   Child8 C8;
   C8=(Child8)(p4);//converting indirectly from Parent to Child4--->Downcasting 
   //parent acts as child temporarily
	}
}
