package com.info.test;
/*
 * program to check for vowel with switch statement.
 * */

import java.util.Scanner;

public class VowelCheck {
	public static void main(String[] args) {
		char ch;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a character :");
		ch = scanner.next().charAt(0);
		switch (ch) {
		case 'A':
		case 'a':
		case 'E':
		case 'e':
		case 'I':
		case 'i':
		case 'O':
		case 'o':
		case 'U':
		case 'u':
			System.out.println(ch+" is vowel!");
			break;
		default:
			System.out.println(ch+" is not a vowel!!");
			break;
		}
		scanner.close();
	}

}
