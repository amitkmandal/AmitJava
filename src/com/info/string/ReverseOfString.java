package com.info.string;

import java.util.Scanner;

/*
 * java program for reverse string.
 */
public class ReverseOfString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String string = scanner.nextLine();
		
		int length = string.length();
		String reverse = "";
		
		for(int i = length-1; i >= 0; i--) {
			reverse = reverse + string.charAt(i);
		}
		System.out.println("The reversed String is :"+reverse);
		scanner.close();
	}

}
