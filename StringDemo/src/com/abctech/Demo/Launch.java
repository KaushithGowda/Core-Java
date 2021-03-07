package com.abctech.Demo;

import java.util.StringJoiner;

public class Launch {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Differences btw concat() and + operator
		String str1 = new String("ABC");
		String str2 = new String("TECH");
		//concat()
        int a = 10;
        //System.out.println(str1.concat(a));
        //concat method accepts only string type
		
        System.out.println(str1.concat(str2));//ABCTECH
		
		// + operator
		//accepts all types of data and converts it to string and executes
		System.out.println(str1+a);//ABC10
		
		//concat() does not create a duplicate object
		String S1 = "ABC";
		String S2 = "";
        String S3 = S1.concat(S2);
        System.out.println(S3);//ABC
        //printing reference address
        System.out.println(System.identityHashCode(S3));
        if (S1==S3) {//S1==S3 compairing references
        	System.out.println("no new object created (concat method)");
        }
        else {
        	System.out.println("new object created (concat method)");
        }
        
        // + operator always creates a new object
        String S4 = "ABC";
		String S5 = "";
        String S6 = S4 + S5;
        System.out.println(S6);//ABC
        if (S4==S6) {
        	System.out.println("no new object created (+ method)");
        }
        else {
        	System.out.println("new object created (+ method)");
        }
        
        //concat does not require a mandatory reference
        String S7 = "ABC";
		String S8 = "TECH";
        S7.concat(S8);
       
        // + should have mandatory reference
        //S7+S8;(error)
        
        //QUESTION1
        String str = new String("ABC");
        str.concat("TECH");
        str = str.concat("TRAINING");
        
        //how many string objects are created--->6
        //how many objects are present in heap and scp--->3 in heap and 3 in sting constant pool 
        //how many implicit and explicit references are present--->3 implicit and 1 explicit reference is created 
        //how many objects are eligible for garbage collection--->2 garbage collector 
        
        //QUESTION2
        String str4 = new String("ABC");
        str4.concat("TECH");
        String str6 = str4.concat("TRAINING");
        
        // how many string objects are created--->7
        //how many objects are present in heap and scp--->3 in heap and 4 in sting constant pool 
        //how many implicit and explicit references are present--->3 implicit and 2 explicit reference is created 
        //how many objects are eligible for garbage collection--->1 garbage collector 
               
        //QUESTION3
        String str7 = new String("ABC");
        str7.concat("TECH");
        String str9 ="ABCTECH".concat("TRAINING");
        
        //how many string objects are created--->7
        //how many objects are present in heap and scp--->3 in heap and 4 in sting constant pool 
        //how many implicit and explicit references are present--->4 implicit and 2 explicit reference is created 
        //how many objects are eligible for garbage collection--->1 garbage collector 
        
        //intern()
        String S10 = "ABC".intern();
        String S11 = "ABC";
        System.out.println(System.identityHashCode(S10));
        System.out.println(System.identityHashCode(S11));
        
        String S12 = new String("ABC");
        String S13 = S12.intern();
        System.out.println(S13);
        if(S12 == S13)
        {
        	System.out.println("Equals");
        }
        else
        {
        System.out.println("Not Equals");//Executed
        }		
        			
        String S20 = new String("RajaRamMohanRoy");
        String S21 = "Ramu";
        //to access one character in C--->S1[6]; used in C
        //to access one character in java
        System.out.println(S20.charAt(6));//m
        
        //to see UNICODE of a character
        System.out.println(S20.codePointAt(3));//97
        
        //to see index value of h
        System.out.println(S20.indexOf('h'));//9
        
        //to see index of a character after a particular number(check for same character after the offset value=5)
        System.out.println(S20.indexOf('R',5));//12
        
        //to see index of a character after a particular number(check for same character after the offset value=3)
        System.out.println(S20.indexOf("Ra",3));//4
        
        //to take-up a part of a string is called sub-string
        System.out.println(S20.substring(4));//RamMohanRoy(begin index)
        System.out.println(S20.substring(4, 7));//Ram(begin index , end index)
        
        //to replace a character in a string
        System.out.println(S20.replace("R","M" ));//MajaMamMohanMoy
        
        //to add '-'(any character) to get Raja-Ram-Mohan-Roy
        System.out.println(String.join("-", "Raja","Ram","Mohan","Roy"));//Raja-Ram-Mohan-Roy
        System.out.println(String.join("-", S21,"Ram","Mohan","Roy"));//Ramu-Ram-Mohan-Roy
        
        //to see length of a String
        System.out.println(S20.length());//15
        
        //to see all of String in Uppercase
        System.out.println(S20.toUpperCase());//RAJARAMMOHANROY
        
        // to see all of string in Lower case
        System.out.println(S20.toLowerCase());//rajarammohanroy
        
        //to obtain square brackets[RajaRamMohanRoy] 
        StringJoiner sj = new StringJoiner("," , "[", "]");// , is delimiter and [ is prefix and ] is a suffix
        //StringJoiner sj = new StringJoiner("delimiter" , "prefix", "suffix");
        sj.add("Raja");
        sj.add("Ram");
        sj.add("Mohan");
        sj.add("Roy");
        System.out.println(sj);//[Raja,Ram,Mohan,Roy]
        
        //to check wheather the character is present in the string
        System.out.println(S20.contains("Ram"));//true 
        System.out.println(S20.contains("Joe"));//false 
        
        //to check with what character the string is starting with
        System.out.println(S20.startsWith("Raja"));//true 
        System.out.println(S20.startsWith("Rama"));//false 

        //to check with what character the string is ending with
        System.out.println(S20.endsWith("Roy"));//true
        System.out.println(S20.endsWith("Rama"));//false
        
        //equals works only with string on both sides
        System.out.println(S20.equals("RajaRamMohanRoy"));//true
        System.out.println(S20.equalsIgnoreCase("RajaRamMohanRoy"));//true
        
        //contentEquals works on all datatypes ie string int etc
        System.out.println(S20.contentEquals("Raja"));//false
        System.out.println(S20.compareTo("RajaRamMohanRoy"));//0
        System.out.println(S20.compareToIgnoreCase("rajarammohanroy"));//0
        
        //to remove a particular character in a string
        String[] arr = S20.split("a");
        for(String a1:arr)
        {
        	System.out.print(a1);//RjRmMohnRoy
        }

        //to remove a particular character in a string
        String[] array = S20.split("a",5 );
        for(String a2:array)
        {
        	System.out.print(" " + a2);//RjRmMohnRoy
        }
        
        System.out.println(" ");
        //replace 
        System.out.println(S20.replace("a", " "));
        System.out.println(S20.replace("a", ""));
        
        //to remove spaces in the string leading and trailing spaces
        String S22 = "     Raja Ram Mohan Roy      ";
        System.out.println(S22.trim());     
        
        //to remove spaces in the string leading and trailing spaces individually Strip was introduced in java11
        System.out.println(S22.stripLeading());//Raja Ram Mohan Roy    
        System.out.println(S22.stripTrailing());//     Raja Ram Mohan Roy
        System.out.println(S22.replace(" ", ""));//RajaRamMohanRoy
        
        //isEmpty() and isBlank()
        String S23=" ";
        System.out.println(S23.isEmpty());//false java 6
        System.out.println(S23.isBlank());//true java 11
        String S24="";
        System.out.println(S24.isEmpty());//true
        System.out.println(S24.isBlank());//true
        
        //adding raja to raja n times
        //order wise time complexity
        
        //case 1
        String S30 = new String("Raja");
        System.out.println(S30);
        String S31 = S30.concat("Raja");
        System.out.println(S31);
        
        //case 2
        String S25 = new String("Raja");
        String S26 = "Raja";
        System.out.println(S25);
        for(int i=1;i<=3;i++)
        {
        	S26= S25.concat(S26);        
        }
        System.out.println(S26);
        
        //case 3
        String S27 = new String(new char[5]);
        System.out.println(S27.replace("\0", "Raja"));
        
        //case 4
        String S28 = new String ("Raja");
        String S29 = S28.repeat (3);
        System.out.println(S29);
        
        byte a3 = 10;
        short b = 200;
        int c = 2000;
        long d = 67887476;
        char e = 'A';
        float f = 56.7f;
        double g = 678.90;
        boolean h = true;
        
        System.out.println(String.valueOf(a3));//10
        System.out.println(String.valueOf(b));//200
        
        int x = 10;
        System.out.printf("%d", x);//10 d=decimal
        System.out.println("");
        int y = 010;        
        System.out.print(y);//8
        System.out.println("");
        int z = 0X10;
        System.out.println(z);//16  
        int m = 07;
        
        //%d=decimal number (base 10)
        System.out.printf("%d", x);//10 
        System.out.println("");
        //%o=octal number (base 8)
        System.out.printf("%o", x);//12
        System.out.println("");
        //to get a 0 before the value
        System.out.printf("%#o", x);//012
        System.out.println("");
        //to get a 0 before the value
        System.out.printf("%#o", m);//07 as it is already in octal
        System.out.println(" ");
        
        //decimal
        System.out.printf("%d", a);
        System.out.printf("%d", b);
        System.out.printf("%d", c);
        System.out.printf("%d", d);
        //character
        System.out.printf("%c", e);
        //float
        System.out.printf("%f", f);
        System.out.printf("%f", g);
        //boolean
        System.out.printf("%b", h);
        System.out.println(" ");
        
        //String Buffer
        StringBuffer sb0 = new StringBuffer();
        System.out.println(sb0.capacity());//16
        
        //String Builder
        StringBuilder sbb0 = new StringBuilder();
        System.out.println(sbb0.capacity());//16
        
        //String Buffer
        StringBuffer sb1 = new StringBuffer("ABC");
        //ABC sits in 0 1 2 in index of 0-15 and also adds-up 3 more spaces in the StringBuffer
        System.out.println(sb1);//ABC
        System.out.println(sb1.capacity());//19
        
        //append does not add-up new spaces else it sits in the leftover space in the StringBuffer
        sb1.append("Training");
        System.out.println(sb1);//ABCTraining
        System.out.println(sb1.capacity());//19
        
        //to increase size of StringBuffer
        //we can modify the capacity 
        StringBuffer sb2 = new StringBuffer(41);
        System.out.println(sb2.capacity());//41
        
        //StringBuffer size increase
        StringBuffer sb3 = new StringBuffer();//16
        sb3.append("Sachin");//Sachin inserted
        System.out.println(sb3.capacity());//16
        sb3.append("is a batsmen");
        //"is a batsmen inserted" and as the characters cross the capacity(1--->16 character(2bytes)) are added
        //formula new capacity = old capacity * 2+2 will be applied
        System.out.println(sb3.capacity());//34
        sb3.append("he was also an Mp");
        //formula new capacity = old capacity * 2+2 will be applied
        System.out.println(sb3.capacity());//70
        
        //ensureCapacity
        StringBuffer sb4 = new StringBuffer();
        System.out.println(sb3.capacity());//16
        //any capacity less than 16 will be of 16 capacity
        sb4.ensureCapacity(15);
        System.out.println(sb4.capacity());//16
        //till the ensureCapacity is 34 the formula new capacity = old capacity * 2+2 will be applicable
        sb4.ensureCapacity(20);
        System.out.println(sb4.capacity());//34
        //after 34 any capacity required will be the same as the required capacity 
        sb4.ensureCapacity(35);
        System.out.println(sb4.capacity());//35
        
        //length() and capacity()
        //In a bus 10 seats are available and 5 people are sitting
        //length=5 and capacity=10
        StringBuffer sb5 = new StringBuffer();
        sb5.append("Indian");
        System.out.println(sb5);//Indian
        System.out.println(sb5.length());//6
        System.out.println(sb5.capacity());//16
        sb5.setLength(5);        
        System.out.println(sb5);//India
        System.out.println(sb5.length());//5
        System.out.println(sb5.capacity());//16
        
        //trimToSize 
        //this will remove extra spaces
        sb5.trimToSize();
        System.out.println(sb5.capacity());//5
        
        //insert in a stringBuffer
        StringBuffer sb6 = new StringBuffer("Raja");
        System.out.println(sb6);//Raja
        sb6.append("Roy");
        System.out.println(sb6);//RajaRoy---->0123456
        //inserting Ram in RajaRoy
        sb6.insert(4,"Rom");
        System.out.println(sb6);//RajaRomRoy---->0123456789
        sb6.insert(7,"MohanKumar");
        System.out.println(sb6);//RajaRomMohanKumarRoy
        
        //setCharAt
        //changing o to a 
        sb6.setCharAt(5,'a');
        System.out.println(sb6);//RajaRamMohanKumarRoy
        
        //to remove a character
        //to remove Kumar from RajaRamMohanKumarRoy
        sb6.delete(12, 17);
        System.out.println(sb6);//RajaRamMohanRoy
        
        //to replace a character
        //to replace Raja with Rani
        sb6.replace(0, 4, "Rani");
        System.out.println(sb6);//RaniRamMohanRoy
        
        //to reverse a character 
        sb6.reverse();
        System.out.println(sb6);//yoRnahoMmaRinaR
        
        //equals method in stringBuffer class
        //in string class the equals method compares contents
        //in string buffer class the equals method will compare references
        StringBuffer sb7 = new StringBuffer("Raja");
        StringBuffer sb8 = new StringBuffer("Raja");
        System.out.println(sb7==sb8);//false 
        System.out.println(sb7.equals(sb8));//false
        
        //to convert non-mutable string to mutable string
        //string to stringBuffer
        String s = "Rama";
        StringBuffer sb9 = new StringBuffer(s);
        System.out.println(sb9);//Rama
        
        //StringBuffer to String
        StringBuffer sb10 = new StringBuffer("setha");
        String sb11 = sb10.toString();
        System.out.println(sb11);
        
        //StringBuilder to String
        StringBuilder sbb = new StringBuilder("Ravanna");
        String sbb1 = sbb.toString();
        System.out.println(sbb1);  
	}   

}
