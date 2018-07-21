package com.info.test.number.conversion;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many random Number do you want to generate ?");
		int len = scanner.nextInt();
		
		System.out.println("Generating "+len+" Random numbers in the range 0...999\n");
		for(int i = 0; i < len; i++) {
			int randomNum = random.nextInt(1000);
			System.out.print(randomNum+"  ");
		}
		scanner.close();
	}

}
