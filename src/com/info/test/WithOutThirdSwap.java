package com.info.test;
/*
 * program for swapping of two number without third variable.
 */

import java.util.Scanner;

public class WithOutThirdSwap {
	public static void main(String[] args) {
		int num1,num2;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two Number :");
		num1 = scanner.nextInt();
		num2 = scanner.nextInt();
		System.out.println("Before Swapping Number Are : "+num1+"------"+num2);
		num1 = num1 * num2;
		num2 = num1/num2;
		num1 = num1/num2;
		System.out.println("After Swapping Number Are :"+num1+"------"+num2);
		scanner.close();
		/*
		 * Another logic
		 * num1 = num1+num2; 5+6=11
		 * num2 = num1-num2; 11-6=5
		 * num1 = num1-num2; 11-5=6
		 */
	}

}
