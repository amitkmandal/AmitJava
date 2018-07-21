package com.info.test;

import java.util.Scanner;

/*
 * program to check original is equal to reverse.
 * */

public class ReverseEqual {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num, temp,rem, rev=0;
		System.out.println("Enter Number: ");
		num = scanner.nextInt();
		temp = num;
		while(temp != 0) {
			rem = temp%10;
			rev = rev * 10 + rem;
			temp = temp/10;
		}
		if (num == rev) {
			System.out.println("Reverse no is equal to original !");	
		}
		else {
			System.out.println("Reverse and original no is not equal !");
		}
		scanner.close();
	}

}
