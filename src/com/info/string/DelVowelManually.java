package com.info.string;

import java.util.Scanner;

/*
 * java program to delete vowel from string manually.
 */

public class DelVowelManually {
	
	private static boolean isVowel(char ch) {
		String vowels = "aeiou";
		for(int i = 0; i < vowels.length(); i++) {
			if(ch == vowels.charAt(i)) {
				return true;
			}
		}
		return false;
	}
	
	private static String removeVowel(String str) {
		String finalString = "";
		for(int i = 0; i < str.length(); i++) {
			if(!isVowel(Character.toLowerCase(str.charAt(i)))) {
				finalString = finalString + str.charAt(i);
			}
		}
		return finalString;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String string = scanner.nextLine();
		
		System.out.println("Removing vowels from [" +string+ "] ");
		String newString = DelVowelManually.removeVowel(string);
		
		System.out.print("vowels removed from the entered string is successfully..!!\nNow the string is :\n");
		System.out.print(newString);
		scanner.close();
	}

}
