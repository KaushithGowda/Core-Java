package com.abc.exception.handling;

import java.util.Scanner;

public class Launch 
{

	public static void main(String[] args) 
	{

		System.out.println("entering the main()");
		int a, b, c;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the value of a: ");
		a = scan.nextInt();
		System.out.println("enter the value of b: ");
        b = scan.nextInt();
        c = a/b;// a=10 and b=0 exception has occurred 
        //JVM comes to this line and collects all mistakes and bundles into a exception object 
        //JVM then throws the reference of that object into that same line(c) 
        //control goes out of program to JVM(incase of JAVA)(incase of C control goes out of program to OS directly)
        //JVM displays the mistakes(handled by JVM)
        //exited abnormally
        System.out.println(c);
        System.out.println("exiting main() normally");
        
	}

}
