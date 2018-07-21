package com.info.test.number.conversion;

import java.util.Scanner;

public class HexadecimalToBinary {
	public static int hexa2decimal(String str) {
		String digits = "0123456789ABCDEF";
		str = str.toUpperCase();
		int val = 0;
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int d = digits.indexOf(ch);
			val = val*16+d;
		}
		return val;
	}
	public static void main(String[] args) {
		int[] binNum = new int[50];
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter hexadecimal number : ");
		String hexadecNum = scanner.nextLine();
		
		int decimalNum = HexadecimalToDecimal.hex2decimal(hexadecNum);
		
		int i = 1;
		while (decimalNum > 0 ) {
			binNum[i++] = decimalNum%2;
			decimalNum = decimalNum/2;
		}
		System.out.print("Equivalent decimal number is :\n");
		for(int j = i-1; j > 0; j--) {
			System.out.print(binNum[j]);
		}
		scanner.close();
		
	}

}

