package com.info.test;
/*
 * program to calculate average and percentage of marks obtained in 5 subjects.
 * */

import java.util.Scanner;

public class AveragePercentage {
	public static void main(String[] args) {
		int[] marks = new int[5];
		float sum = 0;
		float average;
		float percentage;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter five subjects marks: ");
		for (int i = 0; i < marks.length; i++) {
			marks[i] = scanner.nextInt();
			sum += marks[i];
		}
		average = sum/5;
		percentage = (sum/500) * 100;
		System.out.println("Average of marks is : "+average);
		System.out.println("Percentage of obtained marks is : "+percentage+" %");
		scanner.close();
	}

}
