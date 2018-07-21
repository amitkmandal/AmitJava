package com.info.test;

import java.util.Scanner;

/*
 * program to add n Numbers
 * */

public class AddnNumbers {
	public static void main(String[] args) {
		int n,num,sum=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many numbers do you want to add them ?");
		n = scanner.nextInt();
		System.out.println("Enter "+n+" numbers :");
		for(int i = 0; i < n; i++) {
			num = scanner.nextInt();
			sum += num;
		}
		System.out.println("sum of all "+n+" number is "+sum);
		scanner.close();
	}

}
