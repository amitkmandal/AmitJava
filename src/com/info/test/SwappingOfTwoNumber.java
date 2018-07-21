package com.info.test;
/*
 * Swapping of two number using third variable.
 * */

import java.util.Scanner;

public class SwappingOfTwoNumber {
	public static void main(String[] args) {
		int a,b,temp;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Two Numbers : ");
		a = scanner.nextInt();
		b = scanner.nextInt();
		System.out.println("Before swapping A = "+a+" and B = "+b);
		temp = a;
		a = b;
		b = temp;
		System.out.println("After swapping A = "+a+" and B = "+b);
		scanner.close();
	}

}
