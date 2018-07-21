package com.info.test;

import java.util.Scanner;

/*
 * input from keyboard.
 * */
public class SampleProgram3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n;
		System.out.println("Enter Number:");
		n = scanner.nextInt();
		if(n == 10) {
			System.out.println("Good");
		}
		else {
			System.out.println("Bad");
		}
		scanner.close();
	}

}
