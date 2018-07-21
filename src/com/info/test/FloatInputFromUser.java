package com.info.test;
/*
 * program to get float input from user.
 * */

import java.util.Scanner;

public class FloatInputFromUser {
	public static void main(String[] args) {
		float flt;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter floating point no : ");
		flt = scanner.nextFloat();
		System.out.println("You have entered "+flt);
		scanner.close();
	}

}
