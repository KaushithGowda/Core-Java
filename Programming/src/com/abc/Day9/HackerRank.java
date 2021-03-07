package com.abc.Day9;

import java.util.Scanner;

public class HackerRank {

	public static void main(String[] args) {

		System.out.println("nextLine() explaination");
		System.out.println("-------------------------------------------------------------------");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the int:: ");
		int i = scan.nextInt();
		scan.nextLine();
		System.out.print("Enter the String:: ");
		String s = scan.nextLine();
		System.out.println(s);

	}

}
