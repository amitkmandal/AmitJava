package com.info.test;
/*
 * program for fabonacci series.
 */

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		int num1 = 0, num2 = 1, fib, limit;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Upto How Many term ? ");
		limit = scanner.nextInt();
		
		/*printing the first two number fibonacci series*/
		System.out.print("Fabonacci Series "+num1+"  "+num2+"  ");
		fib = num1 + num2;
		
		/*
		 * decrease the limit by two since first two no of fibonacci series already 
		 * printed manually.
		 */
		limit = limit-2;
		
		while(limit > 0) {
			System.out.print(fib+"  ");
			num1 = num2;
			num2 = fib;
			fib = num1 + num2;
			limit--;
		}
		scanner.close();
	}

}
