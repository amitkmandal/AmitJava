package com.info.test.number.conversion;

import java.util.Scanner;

public class OctalToHexadecimal {
	public static void main(String[] args) {
		int binNum,rem;
		String hexadecNum = "";
		char[] hex = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Binary Number: ");
		binNum = scanner.nextInt();
		int temp = binNum;
		while (temp != 0) {
			rem = temp%16;
			hexadecNum = hex[rem]+hexadecNum;
			temp = temp/16;
		}
		System.out.print("Equivalent HexaDecimal number of "+binNum+" is:\n");
		System.out.println(hexadecNum);
		scanner.close();
	}

}
