package com.info.test;
/*
 * program to print table of number.
 * */

import java.util.Scanner;

public class TableOfNumber {
	public static void main(String[] args) {
		int num,tab;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a  Number: ");
		num = scanner.nextInt();
		System.out.println("Table of "+num+" is ");
		for(int i = 1; i <= 10; i++) {
			tab = num*i;
			System.out.println(num+" * "+i+" = "+tab);
		}
		scanner.close();
	}

}
