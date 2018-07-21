package com.info.test;
/*
 * program to check entered input is character or not.
 * */

import java.util.Scanner;

public class CharcterCheck {
	public static void main(String[] args) {
		char ch;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a character: ");
		ch = scanner.next().charAt(0);
		if((ch >= 'a' && ch <= 'z')||(ch >= 'A' && ch <= 'Z')) {
			System.out.println(ch+" is alphabet!");
		}else {
			System.out.println(ch+" is not an alphabet");
		}
		scanner.close();
	}

}
