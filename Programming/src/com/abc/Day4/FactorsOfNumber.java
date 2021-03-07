package com.abc.Day4;

import java.util.Scanner;

public class FactorsOfNumber {

	public static void main(String[] args) {

		System.out.println("---------------------------------------------");
		
		System.out.println("Program6 :: Find factors of a number");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number ::");
		int n = scan.nextInt();
		
		for(int i=1; i<=n; i++) {
			if(n%i == 0) {
				System.out.println(i);
			}
		}
		
		System.out.println("---------------------------------------------");
	}

}
