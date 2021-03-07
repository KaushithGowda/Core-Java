package com.abc.exception.handling.handled;

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
        
        try {    //put the code which is mistake in try method

        	c = a/b; // a=10 and b=0 exception has occurred 
        	//JVM comes to this line and collects all mistakes and bundles into a exception object

        System.out.println(c);
        
        //JVM then throws the reference of that object
        //hence catch method catches it and 'e' should be of exception type  
        
		}catch (Exception e)
		{
			System.out.println("dont divide a number by zero");
		}
        
        //program then exits normally
        
        System.out.println("exiting main() normally");
        
	}

}
