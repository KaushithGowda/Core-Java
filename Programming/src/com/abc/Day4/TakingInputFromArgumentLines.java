package com.abc.Day4;

public class TakingInputFromArgumentLines {

	public static void main(String[] args) {

		System.out.println("-----------------------------------------------------------------------");

		System.out.println("Program2 :: Taking input from command line arguments and adding them");
	
		String a = args[0];
		String b = args[1];
		int x = Integer.parseInt(a);
		int y = Integer.parseInt(b);
		int res = x + y;
		System.out.println(res);

		System.out.println("-----------------------------------------------------------------------");
	}

	

}
