package com.info.array;

import java.util.Scanner;

/*
 * program for largest element in an array.
 */

public class LaegestElement {
	public static void main(String[] args) {
		int[] arr = new int[50];
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter array size: ");
		int n = scanner.nextInt();
		
		System.out.print("Enter array elements :");
		for(int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		
		System.out.print("Searching for the largest number :\n\n");
		int largest = arr[0];
		for(int i = 0; i < n; i++) {
			if(largest < arr[i]) {
				largest = arr[i];
			}
		}
		System.out.print("The largest element of an array is : "+largest);
		scanner.close();
	}

}
