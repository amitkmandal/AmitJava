package com.info.array;
/*
 * program fo find the smallest element in an array.
 */

import java.util.Scanner;

public class SmallestElement {
	public static void main(String[] args) {
		int[] arr = new int[50];
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the size of an array : ");
		int n = scanner.nextInt();
		
		System.out.print("Please enter "+n+" elements into array :");
		for(int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		System.out.print("Seraching for the smallest number : \n\n");
		int smallest = arr[0];
		for(int i = 0; i<n; i++) {
			if(smallest > arr[i]) {
				smallest = arr[i];
			}
		}
		System.out.print("Smallest element into an array : "+smallest);
		scanner.close();
	}

}
