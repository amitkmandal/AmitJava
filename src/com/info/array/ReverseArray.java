package com.info.array;

import java.util.Scanner;



public class ReverseArray {
	public static void main(String[] args) {
		int i;
		int[] arr = new int[30];
		Scanner scanner = new Scanner(System.in);
		System.out.print(" enter the size of an array : ");
		int n = scanner.nextInt();
		
		System.out.print("Enter array elements : ");
		for( i = 0; i<n; i++) {
			arr[i] = scanner.nextInt();
		}
		 int j = i-1; //now j will  point the last element.
		 i = 0; //now i will point the first element.
		
		while(i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		System.out.print("Reverese of array is : \n");
		for(i = 0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}
		scanner.close();
	}

}
