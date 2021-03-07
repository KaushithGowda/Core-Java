package com.abc.ioStreams;

import java.util.Scanner;

public class LaunchInbuiltStreams {

	public static void main(String[] args) {

		//Scanner :: inbuilt class(motor)
		//System.in :: inbuilt stream
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		//out() :: used for output(static method) 
		System.out.println(a);
		//err() :: used for errors(static method)
		System.err.println(a);
	}

}
