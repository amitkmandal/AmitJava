package com.info.test.sorting;

import java.util.Scanner;

/*
 * java program for insertion sort.
 */
public class InsertionSort {
	public static void main(String[] args) {
		int[] arr = new int[50];
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of an array :");
		int n = scanner.nextInt();
		
		System.out.println("Enter the "+n+" elements into an array :");
		for(int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		
		System.out.println("Sorting arrays using insertion sort technique : ");
		for(int i = 1; i < n; i++) {
			int temp = arr[i];
			int j = i-1;
			while(j >= 0 && arr[j] > temp) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
		}
		System.out.println("Arrays after sorting is : ");
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i]+" ");
		}
		scanner.close();
	}

}
