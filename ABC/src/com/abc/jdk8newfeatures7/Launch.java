package com.abc.jdk8newfeatures7;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.time.LocalDate;
import java.time.LocalTime;

//21-1-2021
//ordinal() :: index of constants in enum
enum Vegetables {
	
	POTATO,CUCUMBER,BEETROOT
}

@Documented
@Inherited
@Target({ElementType.TYPE,ElementType.FIELD,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)

@interface Fruit{
	
}

@Fruit
class Grapes{
	
}

//inherits fruit Annoitation
class BlackGrapes extends Grapes{
	
}

public class Launch {

	public static void main(String[] args) {

		System.out.println(Vegetables.POTATO.ordinal());//0
		System.out.println(Vegetables.CUCUMBER.ordinal());//1
		System.out.println(Vegetables.BEETROOT.ordinal());//2
		
		//We can use enum in case of switch
		Vegetables b = Vegetables.POTATO;//b = values(because of toString() overridden)
		
		switch(b) {
		
		case POTATO:
			System.out.println("It is POTATO");
			break;
		case CUCUMBER:
			System.out.println("It is CUCUMBER");
			break;
		case BEETROOT:
			System.out.println("It is BEETROOT");
			break;
		default :
			System.out.println("No Vegetables present");
			break;//optional break as no lines are present below
		}
		
		//Current local day
		LocalDate d = LocalDate.now();
		System.out.println(d);//2021-01-21
		
		System.out.println(d.getYear());//2021
		
		System.out.println(d.getMonth());//JANUARY
		
		System.out.println(d.getMonthValue());//1
		
		System.out.println(d.getDayOfMonth());//21
		
		System.out.println(d.getDayOfWeek());//THURSDAY
		
		//Current local time
		LocalTime t = LocalTime.now();
		System.out.println(t);//13:52:57.660270700
		
		System.out.println(t.getHour());
		
		System.out.println(t.getMinute());
		
		System.out.println(t.getSecond());
		
		System.out.println(t.getNano());
		
	}

}
