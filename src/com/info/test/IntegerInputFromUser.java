package com.info.test;

import java.util.Scanner;

/*
 * program to get integer input from user.
 * */

public class IntegerInputFromUser {
	public static void main(String[] args) {
		int num;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number : ");
		num = scanner.nextInt();
		System.out.println("You have entered : "+num);
		scanner.close();
	}

}
