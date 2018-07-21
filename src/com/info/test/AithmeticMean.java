package com.info.test;

import java.util.Scanner;

/*
 * program to calculate Arithmetic mean.
 * */

public class AithmeticMean {
	public static void main(String[] args) {
		int num, arithMean, sum = 0;
		int[] arr = new int[50];
		Scanner scanner = new Scanner(System.in);
		System.out.println("How Many number do you want to enter ? ");
		num = scanner.nextInt();
		System.out.println("Enter "+num+" Numbers :");
		for (int i = 0; i < num; i++) {
			arr[i] = scanner.nextInt();
			sum += arr[i];
		}
		arithMean = sum/num;
		System.out.println("The arithematic mean is : "+arithMean);
		scanner.close();
	}

}
