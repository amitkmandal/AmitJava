package com.info.test;
/*
 * program to find the factorial.
 * 
 */

import java.util.Scanner;

public class Factorial {
	/*public static int fact(int num) {
		if(num == 0) {
			return 1;
		}else {
			return num*fact(num-1);
		}
	}*/
	public static void main(String[] args) {
		int num, fact=1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number ");
		num = scanner.nextInt();
		for(int i = num; i > 0; i--) {
			fact = fact*i;
		}
		System.out.println("Factorial of "+num+" is "+fact);
		scanner.close();
	}

}
