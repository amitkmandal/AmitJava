package com.info.test.serching;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		int[] arr = new int[50];
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the size of an array: ");
		int n = scanner.nextInt();
		
		System.out.println("Enter "+n+" elements into array :");
		for(int i = 0; i<n; i++) {
			arr[i] = scanner.nextInt();
		}
		System.out.println("Enter the number to be searched: ");
		int search = scanner.nextInt();
		
		int first = 0;
		int last = n-1;
		int middle = (first + last)/2;
		
		while(first <= last) {
			if(arr[middle] < search) {
				first = middle+1;
			}
			else if (arr[middle] == search) {
				System.out.println(search+" found at location "+middle);
				break;
			}
			else {
				last = middle-1;
			}
			middle = (first+last)/2;
		}
		if(first > last) {
			System.out.println("Not found !! "+search+" is not present in List!!");
		}
		scanner.close();
	}

}
