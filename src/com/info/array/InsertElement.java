package com.info.array;

import java.util.Scanner;

/*
 * program for insert an element into an array at specified position.
 */
public class InsertElement {
	public static void main(String[] args) {
		int[] arr = new int[50];
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the size of an array : ");
		int n = scanner.nextInt();
		
		System.out.print("Enter the elements into an array : ");
		for(int i = 0; i<n; i++) {
			arr[i] = scanner.nextInt();
		}
		
		System.out.print("Enter the elements to insert : ");
		int insert = scanner.nextInt();
		System.out.print("At which position enter the index number : ");
		int pos = scanner.nextInt();
		
		//now create a space at the required position
		for(int i = n; i > pos; i--) {
			arr[i] = arr[i-1];
		}
		arr[pos] = insert;
		System.out.print("Elements inserted successfully !! \n");
		System.out.print("Now the new Array is \n");
		
		for(int i=0; i<n+1; i++) {
			System.out.print(arr[i]+" ");
		}
		scanner.close();
	}

}
