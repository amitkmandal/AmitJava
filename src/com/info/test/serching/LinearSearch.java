package com.info.test.serching;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		int[] arr = new int[50];
		int count=0,pos=0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter array size :");
		int n = scanner.nextInt();
		
		System.out.println("Enter the array elements:");
		for(int i = 0; i<n; i++) {
			arr[i] = scanner.nextInt();
		}
		System.out.println("Enter the number to searched:");
		int num = scanner.nextInt();
		
		for(int i = 0; i<n; i++) {
			if(arr[i] == num) {
				count++;
				pos = i+1;
				break;	
			}
		}
		if(count == 0) {
			System.out.println("Number does not found :");
		}
		else {
			System.out.println(num+" found at position :"+pos);
		}
		scanner.close();
	}

}
