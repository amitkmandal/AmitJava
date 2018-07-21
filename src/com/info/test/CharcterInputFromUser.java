package com.info.test;
/*
 * program to get character input from user.
 * */

import java.util.Scanner;

public class CharcterInputFromUser {
	public static void main(String[] args) {
		char ch;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a character : ");
		ch = scanner.next().charAt(0);
		System.out.println("You have entered "+ch);
		scanner.close();
	}

}
