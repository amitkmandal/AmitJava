package com.info.array;

import java.util.Scanner;

/*
 * java program to merge two arrays.
 */

public class Merge2Arrays {
	public static void main(String[] args) {
		int i, k;
		int[] arr1 = new int[50];
		int[] arr2 = new int[50];
		int[] merge = new int[100];
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the size of first array : ");
		int size1 = scanner.nextInt();
		
		System.out.print("Enter the first array elements: ");
		for(i = 0; i < size1; i++) {
			arr1[i] = scanner.nextInt();
		}
		System.out.print("Enter the size of second array: ");
		int size2 = scanner.nextInt();
		
		System.out.print("Enter the second array elements: ");
		for(i = 0; i < size2; i++) {
			arr2[i] = scanner.nextInt();
		}
		System.out.print("Merging the Array :\n");
		for(i = 0; i < size1; i++) {
			merge[i] = arr1[i];
		}
		int size = size1 + size2;
		for(i = 0, k=size1; k < size && i < size2; i++,k++) {
			merge[k] = arr2[i];
		}
		
		System.out.print("New array after merging..\n");
		for(i = 0; i < size; i++) {
			System.out.print(merge[i]+" ");
		}
		scanner.close();
	}

}
