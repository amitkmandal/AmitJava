package com.info.string;

import java.util.Scanner;

/*
 * Delete vowels from string.
 */

public class DeleteVowel {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String orignalString = scanner.nextLine();
		
		System.out.print("Removing vowels from the String [" +orignalString+ "]\n");
		String newString = orignalString.replaceAll("[aeiouAEIOU]", "");
		System.out.print("All vowels removed successfully..!!\nNow the string is :\n");
		System.out.print(newString);
		scanner.close();
	}

}
