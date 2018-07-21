package com.info.test.number.conversion;

import java.util.Scanner;

public class HexadecimalToDecimal {
	public static int hex2decimal(String str) {
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
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the hexadecimal Number: ");
		String hexaDecimalNum = scanner.nextLine();
		int decimalNum =HexadecimalToDecimal.hex2decimal(hexaDecimalNum);
		System.out.println("Eqivalent decimal Number is : "+decimalNum);
		scanner.close();	
	}

}
