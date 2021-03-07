package com.abc.Day15;

import java.util.Scanner;

public class Matrix {

	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {

		System.out.println("-------------------------------------------------------------------");
		System.out.println("Program2 :: To find if the matrix is Symmetric or Unsymmetric");
		System.out.print("Enter the size of an array:: ");
		int n = scan.nextInt();
		int[][] a = new int[n][n];

		System.out.println("Enter the values of an array:: ");
		for (int i = 0; i <= a.length-1; i++) {
			for (int j = 0; j <= a[i].length-1; j++) {
				a[i][j] = scan.nextInt();
			}
		}
		boolean res = isSymmetric(a,n);
		if(res) System.out.println("Symmetric");
		else System.out.println("Unsymmetric");
	}

	static boolean isSymmetric(int[][] a,int n) {
		int[][] tr = new int[n][n];
		transpose(a,tr,n);
		
		for (int i = 0; i <= n-1; i++) {
			for (int j = 0; j <= n-1; j++) {
				if(tr[i][j] != a[i][j]) return false;
			}
		}
		return true;
	}

	static void transpose(int[][] a, int[][] tr, int n) {
		for (int i = 0; i <= n-1; i++) {
			for (int j = 0; j <= n-1; j++) {
				tr[i][j] = a[j][i];
			}
		}
	}
}
