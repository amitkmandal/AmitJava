package com.info.test.number.conversion;

import java.util.Scanner;

/*
 * program for conversion of decimal to hexadecimal number.
 */

public class DecimalToHexadecimal {
	public static void main(String[] args) {
		int decinum,rem,temp;
		String hexadeciNum = "";
		
		/*digits in hexadecimal number system.*/
		
		char[] hex = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a decimal no :");
		decinum = scanner.nextInt();
		temp = decinum;
		while(temp > 0) {
			rem = temp%16;
			hexadeciNum = hex[rem]+ hexadeciNum;
			temp = temp/16;
		}
		System.out.print("Equivelnt hexadecimal number of "+decinum+" is:\n");
		System.out.print(hexadeciNum);
		scanner.close();
	}

}
