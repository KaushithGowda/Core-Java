package com.abc.jdk8newfeatures8;

//25-01-2021
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;
import java.time.LocalDateTime;

public class Launch {

	public static void main(String[] args) {

		//User defined date
		LocalDate d = LocalDate.of(2021, 1, 1);
		System.out.println(d);
		
		//User defined time
		LocalTime t = LocalTime.of(6, 0);
		System.out.println(t);
		
		//Time and Date in the same class
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt.getYear());
		System.out.println(ldt.getMonthValue());
		System.out.println(ldt.getDayOfMonth());
		System.out.println(ldt.getHour());
		System.out.println(ldt.getMinute());
		System.out.println(ldt.getSecond());
		System.out.println(ldt); 
		
		//To get date for future months and past months
		LocalDate d1 = LocalDate.now();
		System.out.println(d1.plusMonths(1));
		System.out.println(d1.minusMonths(1));
		
		//To get difference btw date :: Period.between(<oldYear>,<presentYear>)
		LocalDate d2 = LocalDate.now();
		LocalDate d3 = LocalDate.of(1947, 8, 15);
		Period p = Period.between(d3, d2);
		System.out.println(p);
		System.out.println(p.getYears());//73
		System.out.println(p.getMonths());//5
		System.out.println(p.getDays());//10
		
		//Check for leapYear using java inbuilt method
		LocalDate d4 = LocalDate.now();
		if(d4.isLeapYear()) {
			System.out.println("Is leap year");
		} else {
			System.out.println("It is not leap year");
		}
		
		//TimeZone ID
		ZoneId z = ZoneId.systemDefault();
		System.out.println(z);
		
		//ID information using ZonedDateTime.now(<refOfID>)
		ZonedDateTime zid = ZonedDateTime.now(z);
		System.out.println(zid);
		
		//To get all ZoneIDs present in java
		Set<String> s = ZoneId.getAvailableZoneIds();
		System.out.println(s);
		
		//TimeZone of America/Cuiaba
		ZoneId z2 = ZoneId.of("America/Cuiaba");
		
		//ID information of America/Cuiaba
		ZonedDateTime zid2 = ZonedDateTime.now(z2);
		System.out.println(zid2);
		
		
	}

}











