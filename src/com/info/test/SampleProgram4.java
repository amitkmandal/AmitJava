package com.info.test;

import java.util.Scanner;

/*
 * progrma to find sum and average of three no
 * */
public class SampleProgram4 {
	public static void main(String[] args) {
		int num1, num2, num3;
		int sum = 0;
		int avg = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter three number:");
		num1 = scanner.nextInt();
		num2 = scanner.nextInt();
		num3 = scanner.nextInt();
		System.out.println("You have entered  "+num1+"----"+num2+"----"+num3);
		sum = num1 + num2 + num3;
		System.out.println("Sum of three number is: "+sum);
		avg = sum/3;
		System.out.println("The average of three no is: "+avg);
		scanner.close();
	}

}
