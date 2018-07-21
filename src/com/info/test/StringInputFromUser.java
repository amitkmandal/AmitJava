package com.info.test;
/*
 * program to get String input from user.
 * */

import java.util.Scanner;

public class StringInputFromUser {
	public static void main(String[] args) {
		String str;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an string: ");
		str = scanner.nextLine();
		System.out.println("You have entered : "+str);
		scanner.close();
	}
	
}
