package com.info.test;
/*
 * program to check for vowel.
 * */

import java.util.Scanner;

public class CheckVowel {
	public static void main(String[] args) {
		char ch;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an Alphabet :");
		ch = scanner.next().charAt(0);
		if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i'|| ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U') {
			System.out.println(ch+" is vowel!");
		}
		else {
			System.out.println(ch+" is not a vowel!");
		}
		scanner.close();
	}

}
