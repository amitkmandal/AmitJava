package com.info.test;
/*
 * program to check Leap year.
 * */

import java.util.Scanner;

public class LeapYear {
	int year;
	public String leapYear() {
		if(year%4 == 0 && year%100 != 0) {
			return "Leap Year";
			
		}
		else if (year%100 == 0) {
			return "Leap Year";
		}
		else if (year%400 == 0) {
			return "Leap Year";
		}else {
			return "Not a leap year";
		}
	}
	public static void main(String[] args) {
		LeapYear ly = new LeapYear();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a year : ");
		ly.year = scanner.nextInt();
		String string = ly.leapYear();
		System.out.println(string);
		scanner.close();
	}

}
