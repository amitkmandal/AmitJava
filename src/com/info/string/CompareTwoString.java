package com.info.string;
/*
 * java program for comparing two string.
 */

import java.util.Scanner;

public class CompareTwoString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first String : ");
		String string = scanner.nextLine();
		System.out.println("Enter second String : ");
		String string2 = scanner.nextLine();
		
		if(string.compareTo(string2) > 0) {
			System.out.println("First String is greater than second string. ");
		}
		else if(string.compareTo(string2) < 0) {
			System.out.println("second string the greater than first string. ");
		}
		else {
			System.out.println("First and second string are equals.");
		}
		scanner.close();
	}

}
