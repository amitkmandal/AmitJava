package com.info.array;

import java.util.Arrays;
import java.util.Scanner;

public class OneDArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many Element do you want to stote :");
		int num = scanner.nextInt();
		int[] arr = new int[num];
		System.out.println("Enter"+num+" Elements to store in Array :");
		for(int i = 0; i < num; i++) {
			arr[i] = scanner.nextInt();
		}
		System.out.print("Elements in the Array :\n");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\n");
		}
		System.out.println(Arrays.toString(arr));
		scanner.close();
	}

}
