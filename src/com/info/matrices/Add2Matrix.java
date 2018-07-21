package com.info.matrices;

import java.util.Scanner;

/*
 * java program for addition of two matrices.
 */
public class Add2Matrix {
	public static void main(String[] args) {
		int[][] mat1 = new int[3][3];
		int[][] mat2 = new int[3][3];
		int[][] mat3 = new int[3][3];
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first matrix : ");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				mat1[i][j] = scanner.nextInt();
			}
		}
		System.out.println("Enter second matrix : ");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				mat2[i][j] = scanner.nextInt();
			}
		}
		System.out.println("Adding both matrices to form 3rd matrix : ");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				mat3[i][j] = mat1[i][j] + mat2[i][j];
			}
		}
		
		System.out.println("The two matrix added successfully : \n");
		System.out.println("New Matrix will be : ");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(mat3[i][j]+" ");
			}
			System.out.println();
		}
		scanner.close();
	}
}
