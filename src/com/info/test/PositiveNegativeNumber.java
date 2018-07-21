package com.info.test;

import java.util.Scanner;

/*
 * Program for positive negative and zero count.
 */

public class PositiveNegativeNumber {
	public static void main(String[] args) {
		int countp=0, countn=0, countz=0;
		int[] num = new int[10];
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 10 Numbers : ");
		for (int i = 0; i < num.length; i++) {
			num[i] = scanner.nextInt();
		}
		for (int i = 0; i < num.length; i++) {
			
			if(num[i] < 0) {
				countn++;
			}
			else if (num[i] == 0) {
				countz++;
			}
			else {
				countp++;
			}
		}
		System.out.println("Positive Numbers "+countp+" Negative Numbers "+countn+" Zero "+countz);
		scanner.close();
	}

}
