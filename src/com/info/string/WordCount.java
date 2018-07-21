package com.info.string;

import java.util.Scanner;

public class WordCount {
	public int wordCount(String string) {
		int count = 1;
		for(int i = 0; i < string.length()-1; i++) {
			if(string.charAt(i) == ' ' && string.charAt(i+1) != ' ') {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a sentence :");
		String string = scanner.nextLine();
		
		System.out.println("The total number of words presents in given sentence are: "+new WordCount().wordCount(string));
		scanner.close();
	}

}
