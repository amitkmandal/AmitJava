package com.info.array;

import java.util.Scanner;

/*
 * java program for Two Dimensional array.
 */
public class TwoDArray {
	public static void main(String[] args) {
		int[][] arr = new int[10][10];
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter Number of row for Array (max 10) : ");
		int row = scanner.nextInt();
		
		System.out.print("Enter Number of row for Array (max 10) : ");
		int col = scanner.nextInt();
		
		System.out.print("Enter "+(row*col)+" Array elements : ");
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				arr[i][j] = scanner.nextInt();
			}
		}
		System.out.print("The Array is :\n");
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		scanner.close();
	}

}
