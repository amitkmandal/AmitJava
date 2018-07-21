package com.info.string;

import java.util.Scanner;

public class SortString {
	public static void main(String[] args) {
		String temp;
		Scanner scanner = new Scanner(System.in);
		String[] name = new String[5];
		System.out.println("Enter 5 names :");
		for(int i = 0; i < 5; i++) {
			name[i] = scanner.nextLine();
		}
		System.out.println("\nsorting names in aplhabetical oreder ...\n");
		for(int i = 0; i < 5; i++) {
			for(int j = 1; j < 5; j++) {
				if(name[j-1].compareTo(name[j])>0) {
					temp = name[j-1];
					name[j-1] = name[j];
					name[j] = temp;
				}
				
			}
		}
		System.out.println("Names sorted in alphabetical oreder successfully !");
		System.out.println("Now the List is :");
		for(int i = 0; i < 5; i++) {
			System.out.println(name[i]);
		}
		scanner.close();
	}

}
