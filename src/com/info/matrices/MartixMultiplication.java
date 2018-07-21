package com.info.matrices;

import java.awt.SecondaryLoop;
import java.util.Scanner;

/*
 * Multiplication of two matrix.
 */

public class MartixMultiplication {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		
		System.out.println("Enter row and column for first matrix : ");
		int m = scanner.nextInt();
		int n = scanner.nextInt();
		int[][] first = new int[m][n];
		System.out.println("Enter the first matrix elements : ");
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				first[i][j] = scanner.nextInt();
			}
		}
		
		System.out.println("Enter row and column for second matrix : ");
		int p = scanner.nextInt();
		int q = scanner.nextInt();
		
		if(n != p) {
			System.out.println("Matrix multiplication is not possible : ");
		}
		else {
			int[][] second = new int[p][q];
			int[][] mul = new int[m][q];
			System.out.println("Enter the elements in second matrix : ");
			for(int i = 0; i < p; i++) {
				for(int j = 0; j < q; j++) {
					second[i][j] = scanner.nextInt();
				}
			}
			System.out.println("Multiplying both matrix : ");
			for(int i = 0; i < m; i++) {
				for(int j = 0; j < q; j++) {
					for(int k = 0; k < p; k++) {
						sum += first[i][k] * second[k][j];
					}
					mul[i][j] = sum;
					sum = 0;
				}
			}
			System.out.println("Multiplication successfully completed  : \n");
			System.out.println("Now the matrix multiplication result is : \n");
			for(int i = 0; i < m; i++) {
				for(int j = 0; j < q; j++) {
					System.out.print(mul[i][j]+"\t ");
				}
				System.out.println();
			}
			
		}
	}

}
