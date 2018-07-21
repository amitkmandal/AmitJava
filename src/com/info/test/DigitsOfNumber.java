package com.info.test;

import java.util.Scanner;

/**?
 * Program to add digits of number.
 */

public class DigitsOfNumber {
	public static void main(String[] args) {
		int num,rem,temp,sum=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number : ");
		num = scanner.nextInt();
		temp = num;
		while (num > 0) {
			rem = num%10;
			sum +=rem;
			num = num/10;
		}
		System.out.println("The sum of digits of"+ temp+" = "+sum);
		scanner.close();
	}

}
