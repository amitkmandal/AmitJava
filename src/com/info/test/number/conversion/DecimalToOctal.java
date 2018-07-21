package com.info.test.number.conversion;
/*
 * program to convert decimal number to octal number.
 */

import java.util.Scanner;

public class DecimalToOctal {
	public static void main(String[] args) {
		int decim, quio;
		int[] octNum = new int[100];
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter decimal number :");
		decim = scanner.nextInt();
		quio = decim;
		int i = 1;
		while (quio != 0) {
			octNum[i++] = quio%8;
			quio = quio/8;
		}
		System.out.print("Equivalent octal value of "+decim+ " is :\n");
		for(int j = i-1; j > 0; j--) {
			System.out.print(octNum[j]);
		}
		scanner.close();
	}

}
