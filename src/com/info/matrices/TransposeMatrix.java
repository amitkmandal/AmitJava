package com.info.matrices;

import java.util.Scanner;
/*
 * java program for transpose the matrix.
 */
public class TransposeMatrix {
	public static void main(String[] args) {
		int[][] arr = new int[3][3];
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter 3*3 array elements : ");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				arr[i][j] = scanner.nextInt();
			}
		}
		System.out.println("Transposing Arrays...");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				arr[i][j] = arr[j][i];
			}
		}
		System.out.println("Transpose of the matrix is : ");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		scanner.close();
	}

}
