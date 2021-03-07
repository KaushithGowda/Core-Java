package com.abc.jdk8newfeatures;

interface Display1{
	void disp1();
	void disp2();
	
	//1.defining method in an interface
	default void disp3() {
		System.out.println("Method defination inside an interface");
	}
	
	//2.defining static method in an interface
	static void disp4(){
		System.out.println("Static method inside an interface");
	}
	
	//same method in other interface
	default void disp5() {
		System.out.println("Ambigity problem method");
	}
}

interface Display2{
	
	//same method in other interface
	default void disp5() {
		System.out.println("Ambigity problem method");
	}
}

class Demo implements Display1{

	@Override
	public void disp1() {
		System.out.println("Abstract method Inside disp1");
	}

	@Override
	public void disp2() {
		System.out.println("Abstract method Inside disp2");
	}
	
//	@Override
//	public void disp3() {
//		System.out.println("Overriding disp3");
//	}
	
}

class Demo2 implements Display1,Display2{

//	The type Demo2 must implement the inherited abstract method Display1.disp1()

	@Override
	public void disp5() {
		System.out.println("Overiding to acheive multiple inheritance");
	}

	@Override
	public void disp1() {
		//abstract method
	}

	@Override
	public void disp2() {
		//abstract method
	}

}
public class Launch {

	public static void main(String[] args) {

		Demo d = new Demo();
		d.disp1();//unimplemented overidden method
		d.disp2();//unimplemented overidden method
		d.disp3();//defined method inside an interface
		Display1.disp4();//calling static methood using class name
		
		Demo2 d2 = new Demo2();
		d2.disp5();
		
	}

}
