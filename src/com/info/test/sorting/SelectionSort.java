package com.info.test.sorting;
/*
 * java program for selection sort.
 */

import java.util.Scanner;

public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = new int[50];
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the array size : ");
		int n = scanner.nextInt();
		
		System.out.println("Enter the "+n+" elements into an array :");
		for(int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		
		System.out.println("Sorting arrays using selection sort techniqe : ");
		for(int i = 0; i < n; i++) {
			for(int j = i+1; j < n; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Now the array after sorting is : ");
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i]+" ");
		}
		scanner.close();
	}

}
