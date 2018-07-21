package com.info.test.pattern;

import java.util.Scanner;

public class DaimondPattern {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of rows for diamond pattern:");
		int rows = scanner.nextInt();
		int space = rows-1;
		for(int k = 1; k <= rows; k++) {
			for(int c = 1; c <= space; c++) {
				System.out.print(" ");
			}
			space--;
			for(int c = 1; c <= (2*k-1); c++) {
				System.out.print("*");
			}
			System.out.println();
		}
		space = 1;
		for(int k = 1; k <= (rows-1); k++) {
			for(int c = 1; c <= space; c++) {
				System.out.print(" ");
			}
			space++;
			for(int c = 1; c <= (2*(rows-k)-1); c++) {
				System.out.print("*");
			}
			System.out.println();
		}
		scanner.close();
	}

}
