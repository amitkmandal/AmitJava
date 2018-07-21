package com.info.string;

import java.util.Scanner;

public class CharacterCount {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string..");
		String string = scanner.nextLine();
		
		int i = string.length();
		
		for(char c = 'A'; c <= 'z'; c++) {
			int k = 0;
			for(int j = 0; j < i; j++) {
				char ch = string.charAt(j);
				if(ch == c) {
					k++;
				}
			}
			if(k > 0) {
				System.out.println("The character "+c+" has occured at "+k+" times.");
			}
		}
		scanner.close();
	}

}
