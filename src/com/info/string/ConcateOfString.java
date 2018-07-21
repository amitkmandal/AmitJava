package com.info.string;
/*
 * Concatenation of two string.
 */

import java.util.Scanner;

public class ConcateOfString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first String :");
		String string = scanner.nextLine();
		
		System.out.println("enter the second string :");
		String string2 = scanner.nextLine();
		
		System.out.println("Concatinating first strinng with second string...");
		string = string.concat(string2);
		
		System.out.println("First String after concatination is : "+string);
		scanner.close();
	}

}
