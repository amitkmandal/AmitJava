package com.info.string;

import java.util.Scanner;

/*
 * java program for printing String.
 */
public class PrintingString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your Name ");
		String string = scanner.nextLine();
		System.out.println("Hello "+string);
		scanner.close();
		
	}
}
