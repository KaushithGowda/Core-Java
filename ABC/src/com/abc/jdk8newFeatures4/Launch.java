package com.abc.jdk8newFeatures4;

import java.util.ArrayList;

class SportsBike {
	
	public void riding(){
		System.out.println("Riding in India is tough");
	}
}

class AdventureBike extends SportsBike{
	
	@Override
//	public void ridin() {  //error
		public void riding() {
		System.out.println("Riding in India is easy");
	}
}

class BikePrices{
	
	//Price will be changed in the future so we should not use it
	//In the future the methods will be removed from java So use annotiations
	
	@Deprecated //makes developer realize its deprecated
	public void oldPrice() {
		
		System.out.println("Bike costs 1.7L");
	}
	
	public void newPrice() {
		
		System.out.println("Bike costs 2.26L");
	}
}

@FunctionalInterface
interface Demo{
	
	void add();
//	void sub();//error because in functional interface only one abstract method should be present 
}

/*Some Inbuilt
 * 1.@SuppressWarnings
 * 2.@Override 
 * 3.@Deprecated
 * 4.@FunctionalInterface*/

/*User Defined Annotiations
 * Signature :: public @interface <nameOfAnnotiation> {<body>}
 * There are three types of Annotiation :
 * 1.Marker annotiation
 * 2.Single Valued Annotiation
 * 3.Multi Valued Annotiation*/

//1.Marker annotiation
 @interface Cricket {
	
	//empty annotiation/marker annotiation/tagged annotiation
}
 
// 2.Single Valued Annotiation
 @interface Fruit {

	 //User Defined method
//	 String delecious();

	 //creating value method to send the data without calling method name
	 String value();
 }

// 3.Multi Valued Annotiation
 @interface Football {
	 
//	 String joy();
//	 String happiness();
	 String joy() default "max out";
	 String happiness() default "max out";
 }
 
@Cricket//Marker annotiation

//@Fruit(delecious="very tasty")//Single Valued Annotiation 

@Fruit("very tasty")//Single Valued Annotiation //creating a value method and sending the data without calling method name

//@Football(joy="maximum",happiness="maxmimum")//Multi Valued Annotiation
@Football//Multi Valued Annotiation //default values taken in

@SuppressWarnings("unchecked")//this makes rawtype ArrayList warning disapper
public class Launch {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		@SuppressWarnings("rawtypes")
//		@SuppressWarnings("unused") //error duplicate @SuppressWarnings
		ArrayList al = new ArrayList();
//		al.add(100);//I dont want it and so I need to suppress unused warning
		al.add("ABC");//The ArrayList data should be of raw type hence adding unchecked warning suppress
		
		AdventureBike ab = new AdventureBike();
		ab.riding();
		
		BikePrices bp = new BikePrices();
		bp.oldPrice();//deprecated method
	}

}
