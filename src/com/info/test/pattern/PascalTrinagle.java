package com.info.test.pattern;

import java.util.Scanner;

public class PascalTrinagle {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number of rows:");
		int rows = scanner.nextInt();
		//int num = 1;
		for(int i = 0; i < rows; i++) {
			for(int k = rows; k > i; k--) {
				System.out.print("x");
			}
			int num = 1;
			for(int j = 0; j <= i; j++) {
				System.out.print(num+" ");
				num = num*(i-j)/(j+1);
			}
			System.out.println();
		}
		scanner.close();
	}
}
