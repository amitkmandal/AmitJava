package com.info.test.number.conversion;

import java.util.Scanner;

public class DecimalToBinary {
	public static void main(String[] args) {
		int decim, quot;
		int[] binnum = new int[30];
		int i = 1;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter decimal number :\n");
		decim = scanner.nextInt();
		quot = decim;
		while (quot > 0) {
			binnum[i++] = quot%2;
			quot = quot/2;
		}
		for(int j =i-1; j>0; j--) {
			System.out.print(binnum[j]);
		}
		scanner.close();
	}

}
