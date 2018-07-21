package com.info.test;
/*
 * program to check even or odd.
 * */

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		int num;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number :");
		num = scanner.nextInt();
		if(num%2 == 0) {
			System.out.println("This number is even!");
		}
		else {
			System.out.println("The number is odd!");
		}
		scanner.close();
	}

}
