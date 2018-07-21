package com.info.test.pattern;

import java.util.Scanner;

public class FloydTriangle {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num =1;
		System.out.println("Enter range Upto how many lines ? :");
		int range = scanner.nextInt();
		System.out.println("Floyd Triangle is: ");
		for(int i = 0; i < range; i++) {
			for(int j = 0; j <= i; j++, num++) {
				System.out.print(num+" ");
			}
			System.out.println();
		}
		scanner.close();
	}

}
