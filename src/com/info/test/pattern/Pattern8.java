package com.info.test.pattern;

import java.util.Scanner;

public class Pattern8 {
	public static void main(String[] args) {
		int k=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of rows :");
		int rows = scanner.nextInt();
		for(int i = 1; i <= rows; i++) {
			for(int space = 1; space <=(rows-i); space++) {
				System.out.print(" ");
			}
			while (k != (2*i-1)) {
				System.out.print("* ");
				k++;
			}
			k = 0;
			System.out.println();
		}
		scanner.close();
	}

}
