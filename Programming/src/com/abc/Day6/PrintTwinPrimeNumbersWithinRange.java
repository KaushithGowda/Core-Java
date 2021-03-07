package com.abc.Day6;

import java.util.Scanner;

public class PrintTwinPrimeNumbersWithinRange {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {

		System.out.println("------------------------------------------------------------");
		System.out.println("Program1 :: Print twin Prime Numbers within Range");
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the start range :: ");
		int start = scan.nextInt();
		System.out.print("Enter the start range :: ");
		int end = scan.nextInt();
		
		for(int i=start; i<=end; i++) 
		{
			
			boolean g = prime(i);
			boolean h = prime(i+2);
			if(g && h) {
				System.out.println(i+" "+ (i+2));
			}
		}
		
	}

	static boolean prime(int m)
		{
		int count = 0;
			for(int j=1; j<=m; j++) 
			{
				if(m%j == 0){
					
					++count;
				
				}
			}
			if(count == 2){
				
				return true;
				
			} else {
				
				return false;
				
			}
	}
}