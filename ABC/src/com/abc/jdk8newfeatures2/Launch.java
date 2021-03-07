package com.abc.jdk8newfeatures2;

//13-1-2021

@FunctionalInterface //an interface with only one abstract method
interface Display{
	
	void disp1();
//	void disp2();//error
//	void disp3();//error
	default void disp4() {
		//possible because this is default method
	}

	static void disp5() {
		//possible because this is static method
	}
}

@FunctionalInterface //an interface with only one abstract method
interface Display2{

	void disp1(int a);
	
}

interface Display3{
	
	void disp1(int a,int b);
	
}

interface Display4{
	
	int disp1(int a,int b);
	
}

class Demo implements Display{
	
	public void disp1() {
		System.out.println("Hello from Functional interface");
	}
}

public class Launch {

	public static void main(String[] args) {
		
		Demo d1 = new Demo();
		d1.disp1();
		
		//Innner Class :: Class inside a Class
		class Demo2 implements Display{

			public void disp1() {
				System.out.println("Hello from Inner Class");
			}
		}

		Demo2 d2 = new Demo2();
		d2.disp1();
		
		//Anonynomos Class :: Class without a Name (can be refered using its reference)
		Display d3 = new Display() {//new..(space) create an anonynomos class and after that we should write an interface which needs to implemented
			
			public void disp1() {
				System.out.println("Hello from Anonynomos Class");
			}
		};//Anonynomos Class should be ended with a semi-colon

		//Object of Anonynomos Object will be created while Class is created using new keyword
		//now using reference we can call the method
		d3.disp1();
		
		//Implementing disp1() method using Lamda 
		//Lamda expression works only in the Functional Interfaces
		//()->{};  :: Syntax of lamda 
		
		//order of lamda
		//Implenting Interface Reference = (<params>)->{<body>};
		Display d4=()->{

			System.out.println("Hello from Lamda");
		};
		d4.disp1();
		
		//brackets of body of lamda are optional
		Display d5=()->System.out.println("Hello from Lamda without body brackets");
		d5.disp1();
		
		//brackets of body when many statemnts are present
		//statements will be executed reverse order
		Display d12 = ()->
		System.out.print("Hello");
		System.out.print("What's Up");
		System.out.print("World");
		//calling the method
		d12.disp1();
		System.out.println();
		
		Display2 d6=(int a)->System.out.println("Hello from Lamda with params"+"-->"+a);
		d6.disp1(5);
		
		//params brackets are optional(only when one param)
		//params datatype is optional
		Display2 d7=a->System.out.println("Hello from Lamda without datatype of params and without brackets of body of lamda"+"-->"+a);
		d7.disp1(5);
		
		//Lamda Expression with more than one parameter 
		Display3 d8=(a,b)->System.out.println(a+" & "+b+" "+"Two parameter Lamda");
		d8.disp1(10, 20);
		
		//returning int value lambda
		Display4 d9=(a,b)->{
			int c= a+b;
			return c;
		};
		System.out.println(d9.disp1(10, 15)+" "+"Creating a return statement");

		//Cannot remove body brackets when defining datatypes inside the body of lambda
//		Display4 d10=(a,b)->
//			int c= a+b;//error
//			return c;
		
		//We can write it as below
		//Eliminating return statement and defination of datatype in the body of lambda
		Display4 d11 =(a,b)->(a+b);
		System.out.println(d11.disp1(10,25)+" "+"Eliminating return statement and defination of datatype in the body of lambda");
		
		
		
	}
}
