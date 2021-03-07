package com.abc.jdk8newfeatures5;

import java.lang.annotation.Documented;
//import java.lang.annotation.Annotation;//go to Annotation an = c.getAnnotation(Cricket.class); and uncomment
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//Interface :: Was used to specify constants before jdk1.5
interface Demo1{
	
	String name = "USA";
}

//Enum :: Introduced in jdk1.5 :: Used to specify constants
/*Enum syntax ::
 * enum <enumName>{
 *   //body
 *  }
 *  Note :: 
 *  1.enum cannot be inheritted or implemented;methods must be called using Ref of object(internally done by jvm) created by jvm.
 *  2.as many constants will be declared such many objects will be created.
 *  3.we can give enum inside any class and we cannot give enum inside main method.
 *  4.enum can implement interfaces.
 *  5.enum cannot extend classes because it is already extending object and java doesn't support multiple inheritance.
 *  Rule :: enum should mandatorily have a constant to have a 
 *  method(because that constant will have an objet with ref of same constant name which contains this method which we define)
*/  

enum Demo2{
	
	//enum constants
	India,Australia,SouthAfrica;
	
	//enum methods
	public static void message1() {
		System.out.println("inside enum--->static method");
	}

	//enum 
	public void message2() {
		System.out.println("inside enum--->non-static method");
	}
}

/*
 * Internal work of enum :: It creates its own class and provides RefName as same as Constant
 *   					   and attaches public static final to it 
 *   					   We can call constants using Ref(Which is same as name of Constant name)
 * class Demo{
 *   	public static final Demo India = new Demo();
 *   	public static final Demo Australia = new Demo();
 *   	public static final Demo SouthAfrica = new Demo();
 * }
 * */

//refer next programs for ElementType explaination (enum) till 21-1-2021 and come back for this programs

//Declaring to what things annotation should work
@Target({ElementType.TYPE,ElementType.FIELD,ElementType.METHOD})

//Declaring when the annotation to work 
@Retention(RetentionPolicy.RUNTIME)

//21-1-2021
//inherited Annotiation :: The default Annotiation is not inherited by child classes but when we use Inherited annotiataion in the parent class all the child classes will inherit
@Inherited 

//Documented Annotiation
@Documented //  ----> /**+enter
/**
 * 
 * @author Kaushith
 *
 */
@interface Cricket {
	//method overloading is not possible i.e value should be used once
//	String value() default "ABC";
//	int value() default 10;
	
	String Bat();
	int NoOfBats();
	float BatPrice();
}

@Cricket(Bat="Mrf",NoOfBats=10,BatPrice=10567.4f)
class Rahul{
	
}

@SuppressWarnings("unchecked")
public class Launch {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		Rahul r = new Rahul();
		Class c= r.getClass();
		//Annotation an = c.getAnnotation(Cricket.class);//type casted below
		Cricket an = (Cricket)c.getAnnotation(Cricket.class);
		System.out.println(an);
		
		//Constants using Interfaces
		System.out.println(Demo1.name+"--->"+"Constants using Interfaces");
		
		//Constants using Enum
		System.out.println(Demo2.India+"--->"+"Constants using Enum");
		
		//static method call of enum
		Demo2.message1();
		
		//non-static method call of enum
		Demo2.India.message2();
		
	}

}
