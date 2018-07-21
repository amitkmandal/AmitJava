package com.info.array;

import java.util.Scanner;

/*
 * java program to delete element in an array.
 */

public class DeleteElement {
	public static void main(String[] args) {
		int count=0;
		int[] arr = new int[50];
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter Array size : ");
		int n = scanner.nextInt();
		
		System.out.print("Enter array elements : ");
		for(int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		
		System.out.print("Enter element to be deleted : ");
		int del = scanner.nextInt();
		for(int i = 0; i < n; i++) {
			if(arr[i] == del) {
				for(int j=i; j <(n-1); j++) {
					arr[j] = arr[j+1];
				}
				count++;
				break;
			}
		}
		if(count == 0) {
			System.out.print("Element not found : ");
		}
		else {
			System.out.print("Element deleted successfully : ");
			System.out.print("\n Now the new Array is : \n");
			for(int i= 0; i <(n-1); i++) {
				System.out.print(arr[i]+" ");
			}
		}
		scanner.close();
	}

}
