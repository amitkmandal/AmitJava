package com.info.string;

import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first string :");
		String string = scanner.nextLine();
		System.out.println("Enter second string :");
		String string2 = scanner.nextLine();
		 int len1 = string.length();
		 int len2 = string2.length();
		 int found = 0,not_found = 0;
		 
		 if (len1 == len2) {
			int len = len1;
			for(int i = 0; i < len; i++) {
				 found = 0;
				for(int j = 0; j < len; j++) {
					if(string.charAt(i) == string2.charAt(j)) {
						 found = 1;
						 break;
					}
				}
				if(found == 0) {
					 not_found = 1;
					break;
				}
			}
			if(not_found == 1) {
				System.out.println("Strings are not anagram to each other : ");
			}
			else {
				System.out.println("Strings are anagram !!");
			}
		}
		 else {
			 System.out.println("Both string must have the same number of character to be an Anagram !!");
		 }
	}

}
