package com.info.test;

import java.util.Scanner;

/*
 * program to check given number is armstrong number or not.
 */

public class ArmStrongNumber {
	public static void main(String[] args) {
		int num,rem, temp,sum=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a positive number : ");
		num = scanner.nextInt();
		temp = num;
		while(temp != 0) {
			rem = temp%10;
			sum += rem*rem*rem;
			temp = temp/10;
		}
		if(sum == num) {
			System.out.println("The number is Armstrong number:");
		}
		else {
			System.out.println("Number is not an Armstrong Number");
		}
		scanner.close();
	}

}
