package com.info.test;
/*
 * program to check whether no is prime or not.
 * */

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		int num; 
		int count=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number : ");
		num = scanner.nextInt();
		for(int i = 1; i <= num; i++) {
			
			if(num%i == 0) {
				count++;
			}
		}
		if(count == 2) {
			System.out.println("The number is prime!");
		}
		else
		{
			System.out.println("The number is not a prime!");
		}
		
		/* Another way to write the same program
		 * int num;
		 * int count = 0;
		 * for(int i = 2; i < num; i++){
		 * 		if(num%i == 0){
		 * 			count++;
		 * 			break;
		 * 		}
		 * 		if(count == 0){
		 * 			System.out.println("The number is prime!");
		 * 		}
		 * 		else
		 * 		{
		 * 			System.out.println("The no is not prime!");
		 * 		}
		 * }
		 * */
		scanner.close();
	}

}
