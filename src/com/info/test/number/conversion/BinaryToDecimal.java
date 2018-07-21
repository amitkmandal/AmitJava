package com.info.test.number.conversion;

import java.util.Scanner;

/*
 * program to convert binary to decimal
 */

public class BinaryToDecimal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a binary Number :");
		String n = scanner.nextLine();
		System.out.println(Integer.parseInt(n,2));
		scanner.close();
		
		/*
		  Another logic:
		  --------------
		  System.out.print("Enter Binary Number :");
		  int n = scanner.nextInt();
		  int decimal = 0, p = 0;
		  while(n != 0){
		  	decimal += ((n%10)*Math.pow(2,p));
		  	n = n/10;
		  	p++;
		  }
		  System.out.println(decimal);
		 */
	}

}
