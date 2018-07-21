package com.info.string;

import java.util.Scanner;

/*
 * java program to find the length of the string.
 */

public class LengthOfString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your Name : ");
		String string = scanner.nextLine();
		int length = string.length();
		
		System.out.println("Length of the entered String is "+length);
		
		scanner.close();
	}

}
