package com.abc.Day15;

import java.util.Arrays;
import java.util.Scanner;

public class GoodBadNumber {

	public static void main(String[] args) {

		System.out.println("-------------------------------------------------------------------");
		System.out.println("Program1:: To find magic number");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of an array:: ");
		int n = scan.nextInt();
		int[] a = new int[n];
		int good=0,bad=0;
		System.out.println("Enter the values of an array:: ");
		for(int i=0; i<=a.length-1; i++) {
			a[i] = scan.nextInt();
		}
		int[] b = Arrays.copyOf(a,n);
		Arrays.sort(b);
		for(int i=0; i<=a.length-1; i++) {
			if(a[i]==b[i])good+=a[i];
			else bad+=a[i];
		}
		int magicNumber = good - bad;
		System.out.println("MagicNumber:: "+Math.abs(magicNumber));
		System.out.println("-------------------------------------------------------------------");
	}

}
