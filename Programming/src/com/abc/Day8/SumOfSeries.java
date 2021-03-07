package com.abc.Day8;

import java.util.Scanner;

public class SumOfSeries {

	public static void main(String[] args) {

		System.out.println("----------------------------");
		System.out.println("Program1 :: Sum of series");
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number:: ");
		int n = scan.nextInt();
		int sum = 0;
		for(int i=1; i<=n; i++) {
			sum+=i;
		}
		System.out.println(sum);
	}

}
