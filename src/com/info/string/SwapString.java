package com.info.string;

import java.util.Scanner;

public class SwapString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first string!");
		String string = scanner.nextLine();
		System.out.println("Enter second string!");
		String string2 = scanner.nextLine();
		
		System.out.println("String before swapping : ");
		System.out.println("string : "+string);
		System.out.println("string2 :"+string2);
		
		String temp = string;
		string = string2;
		string2 = temp;
		
		System.out.println("String after swapping : ");
		System.out.println("string :"+string);
		System.out.println("string2 :"+string2);
		scanner.close();
		
	}

}
