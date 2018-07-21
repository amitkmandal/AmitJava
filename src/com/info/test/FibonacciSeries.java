package com.info.test;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		int n,a=0,b=0,fib = 1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number : ");
		n = scanner.nextInt();
		System.out.print("Fibonacci Series is : ");
		for(int i = 1; i <= n; i++) {
			a = b;
			b = fib;
			fib = a + b;
			System.out.print(a+"  ");
		}
		scanner.close();
	}

}
