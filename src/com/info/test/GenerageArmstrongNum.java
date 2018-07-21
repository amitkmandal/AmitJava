package com.info.test;

import java.util.Scanner;

/*
 * program to generate armstrong number between range.
 */

public class GenerageArmstrongNum {
	public static void main(String[] args) {
		int num1, num2, temp,sum, rem,count=0;
		Scanner scanner = new Scanner(System.in);
		
		/*Enter the interval (two numbers) */
		System.out.println("Enter the starting interval :");
		System.out.println("Enter the first number ");
		num1 = scanner.nextInt();
		System.out.println("Enter the second number ");
		num2 = scanner.nextInt();
		for(int i = num1+1; i < num2; i++) {
			temp = i;
			sum = 0;
			while(temp != 0) {
				rem = temp%10;
				sum += rem*rem*rem;
				temp = temp/10;
			}
			if (i == sum) {
				if(count == 0) {
					System.out.print("Armstrong Number between given interval are : \n");
				}
				System.out.print(i +" ");
				count++;
			}
		}
		if (count == 0) {
			System.out.println("Armstrong Number is not found in given interval !");
		}
		scanner.close();
	}

}