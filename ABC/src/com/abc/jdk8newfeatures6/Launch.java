package com.abc.jdk8newfeatures6;

//20-01-2021 Some REPEATED CONCEPT

enum Vegetables {
	
	//Passing the parameters to constructors 
	//public static final RADISH = new Vegetables("20")   --------> internal work of jvm
	//public static final CARROT = new Vegetables("tasty")   --------> internal work of jvm
	//public static final ONION = new Vegetables()   --------> internal work of jvm(<zero param> constructor)
	RADISH(20),CARROT(40,"tasty"),ONION;
	
	//Static method
	public static void demo1() {
		System.out.println("Inside enum--->Static method");
	}

	//Non-Static method
	public void demo2() {
		System.out.println("Inside enum--->Non-Static method");
	}
	
	//Variables
	String tasty = "very tasty--->Variables in enum";
	//Instance variable :: Value not assigned by developer means jvm will assign default values(0-->int,null-->string)
	int noOfCarrot;
	
	int priceOfCarrot;
	String tasteOfCarrot;
	int priceOfRadish;
	int priceOfOnion;
	
	//Constructors1//Carrot
	Vegetables(int priceOfCarrot,String tasteOfCarrot){
		this.priceOfCarrot = priceOfCarrot;
		this.tasteOfCarrot = tasteOfCarrot;
	}
	
	//Getter for Constructor1
	int getPriceOfCarrot(){
		return priceOfCarrot;
	}
	
	//Getter for Constructor1
	String getTasteOfCarrot() {
		return tasteOfCarrot;
	}
	
	//Constructor2//Radish
	Vegetables(int priceOfRadish){
		this.priceOfRadish = priceOfRadish;
	}

	//Getter for Constructor2
	int getPriceOfRadish(){
		return priceOfRadish;
	}
	
	//Constructor3//Onion
	Vegetables(){
		this.priceOfOnion = priceOfOnion;
	}

	int getPriceOfOnion(){
		return priceOfOnion;
	}
	
}

//Accessing constants when we don't know the names of it and how many are present in it Ref for() below
enum Cricket{
	
	SACHIN,KOHLI,DHONI
}

public class Launch {
	
	//We can define enums inside any class i.e inner class
	enum Vegetables2{
		
		DRUMSTICK,BRINJAL
	}
	
	//Empty/Marker enum
	enum Vegetables3{
		//Marker enum
	}

	public static void main(String[] args) {
		
		/* We cannot give enums local to a method inside the class(i.e inside a main method)
		 * enum Vegetables3{
		 * error
		 * }*/

		System.out.println(Vegetables.RADISH);
		System.out.println(Vegetables.CARROT);

		//Static method call
		Vegetables.demo1();

		//Non-Static method call
		Vegetables.CARROT.demo2();
		
		//Accessing the variables
		System.out.println(Vegetables.CARROT.tasty);
		
		//Accessing the variables
		System.out.println(Vegetables.CARROT.noOfCarrot);//0(default value assigned by jvm)
	
		//Getter method call
		System.out.println(Vegetables.CARROT.getPriceOfCarrot());
		System.out.println(Vegetables.CARROT.getTasteOfCarrot());
		System.out.println(Vegetables.RADISH.getPriceOfRadish());
		System.out.println(Vegetables.ONION.getPriceOfOnion());//0(default value given by jvm)
		
		Cricket[] c = Cricket.values();
		
		for (Cricket c1 : c) {
			
			System.out.println(c1);
		}
		
		
	}

}
