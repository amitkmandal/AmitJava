package com.info.test;

import java.util.Scanner;

/*
 * Another way to check prime no.
 * */

public class Prime {
	public static void main(String[] args) {
		int num;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		num = scanner.nextInt();
		for(int i = 2; i < num; i++) {
			if(num%i == 0) {
				System.out.println("The Number is not prime!");
				break;
			}
			else {
				System.out.println("The number is prime!");
				break;
			}
		}
		scanner.close();
	}

}
