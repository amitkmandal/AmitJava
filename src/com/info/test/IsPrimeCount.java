package com.info.test;

import java.util.Scanner;

/*
 * Counting of prime no.
 * */
public class IsPrimeCount {
	public static void main(String[] args) {
		int start, end, count =0;
		System.out.println("Enter the Range : ");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First Number :");
		start = scanner.nextInt();
		System.out.println("Enter Second Number :");
		end = scanner.nextInt();
		System.out.print("Prime numbers between "+start+" - "+end+" is :\n");
		for(int i = start; i <= end; i++) {
			count = 0;
			for(int j =2 ; j < i; j++) {
				if(i%j == 0) {
					count++;
					break;
				}
			}
			if(count == 0) {
				System.out.print(i+" ");
			}
		}
		scanner.close();

	}

}
