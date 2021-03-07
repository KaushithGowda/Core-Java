package com.abc.Day5;

import java.util.Scanner;

public class SumOfLastTwoDigits {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		System.out.println("-------------------------------");
		System.out.println("Program :: Sum of last two digits");
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number:: ");
		int n = scan.nextInt();
		int temp = 0;
		int sum = 0;
		int i= 1;
		// n = 123
		while(i<=2) {			//when   i=1    i=2
			temp = n%10; 				//3		//2 	
			sum = sum + temp; 			//0+3	//3+2 = 5
			n = n / 10;					//12	//0
			i++;
		}
		System.out.println("Sum of last two digits :: "+sum);
	}

}
