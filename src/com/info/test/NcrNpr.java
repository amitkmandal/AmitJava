package com.info.test;

import java.util.Scanner;

/*
 * program to calucate ncr and npr.
 */

public class NcrNpr {
	public static int fact(int num) {
		int fact = 1;
		for(int i = 1; i <= num; i++) {
			fact = fact*i;
		}
		return fact;
	}
	public static void main(String[] args) {
		int n, r;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Value of n : ");
		n = scanner.nextInt();
		System.out.println("Enter Value of r : ");
		r = scanner.nextInt();
		
		System.out.println("NCR = "+(fact(n)/(fact(n-r)*fact(r))));
		System.out.println("NPR = "+(fact(n)/(fact(n-r))));
		
		scanner.close();
	}

}
