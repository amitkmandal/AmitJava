package com.info.string;
/*
 * java program for delete word from sentence.
 */

import java.util.Scanner;

public class DeleteWord {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String : ");
		String string = scanner.nextLine();
		
		System.out.println("Enter the word to be deleted : ");
		String word = scanner.nextLine();
		
		System.out.print("Deleting all '"+ word + "' from '"+ string +"'...\n");
		string = string.replaceAll(word, "");
		
		System.out.println("Specified word deleted successfully from the string ....");
		
		System.out.print("\nNow the string is:\n");
		System.out.println(string);
		scanner.close();
	}

}
