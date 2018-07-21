package com.info.test.number.conversion;

import java.util.Scanner;

public class HexadecimalToOctal {
	public static int hexa2decimal(String str) {
		String digits = "0123456789ABCDEF";
		str = str.toUpperCase();
		int val = 0;
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int d = digits.indexOf(ch);
			val = val*16 + d;
		}
		return val;
	}
	public static void main(String[] args) {
		int[] octalNum = new int[100];
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the hexadecimal Number : ");
		String hexadecNum = scanner.nextLine();
		
		int decimalNum = HexadecimalToDecimal.hex2decimal(hexadecNum);
		
		int i = 1;
		
		while (decimalNum != 0) {
			octalNum[i++] = decimalNum%8;
			decimalNum = decimalNum/8;
		}
		System.out.print("Equivalent decimal number is :\n");
		for(int j = i-1; j > 0; j--) {
			System.out.print(octalNum[j]);
		}
		scanner.close();
	}

}
