package com.abc.Day8;

import java.util.Scanner;

public class HCF {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number:: ");
		int num1 = scan.nextInt();
		System.out.println("Enter the second number:: ");
		int num2 = scan.nextInt();
		int hcf = 0;
		int min = (num1 < num2) ? num1 : num2;
		for (int i = 1; i <= min; i++) {
			if ((min % i == 0) && (min % i == 0)) {
				hcf = i;
			}
		}
		System.out.println("The HCF is :: " + hcf);
		int lcm = (num1*num2)/hcf;
		System.out.println(lcm);
	}

}
