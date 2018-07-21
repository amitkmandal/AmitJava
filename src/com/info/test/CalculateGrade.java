package com.info.test;

import java.util.Scanner;

/*
 * program to calculate grade.
 * */
public class CalculateGrade {
	public static void main(String[] args) {
		int[] marks = new int[5];
		float avg, sum = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter marks obtained in 5 subects : ");
		for (int i = 0; i < marks.length; i++) {
			marks[i] = scanner.nextInt();
			sum += marks[i];
		}
		avg = sum/marks.length;
		System.out.println("Your grade is : ");
		if (avg <= 100 && avg >= 90) {
			System.out.println("A");
		}else if (avg >=70 && avg < 90) {
			System.out.println("B");
		}else if (avg >=60 && avg < 70) {
			System.out.println("C");
		}else if (avg >=50 && avg < 60) {
			System.out.println("D");
		}else {
			System.out.println("Fail!!");
		}
		scanner.close();
	}

}
