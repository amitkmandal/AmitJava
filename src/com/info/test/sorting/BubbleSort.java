package com.info.test.sorting;

import java.util.Scanner;

/*
 * java program for bubble sort.
 */

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = new int[50];
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the size of an array : ");
		int n = scanner.nextInt();
		
		System.out.print("Enter "+n+" elements into an array : ");
		for(int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		
		System.out.print("sorting arrays using bubble sort technique : ");
		for(int i = 0; i < n-1; i++) {
			for(int j = 0; j <(n-i-1); j++) {
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.print("Arrays sorted successfully !!\n");
		System.out.print("Sorted list in accending order : \n");
		for(int i = 0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}
		scanner.close();
	}

}
