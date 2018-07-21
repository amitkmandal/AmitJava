package com.info.string;

import java.util.Scanner;

public class CopyString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String :");
		String orignalString = scanner.nextLine();
		
		System.out.println("Copying string...");
		StringBuffer copyString = new StringBuffer(orignalString);
		
		System.out.println("string copied successfully..!!");
		System.out.println("The copied String is "+copyString);
		
		scanner.close();
	}

}
