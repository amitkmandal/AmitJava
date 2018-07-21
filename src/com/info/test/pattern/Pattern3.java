package com.info.test.pattern;

public class Pattern3 {
	public static void main(String[] args) {
		int k = 8;
		for(int i = 0; i<5; i++) {
			for(int j = 0; j < k; j++) {
				System.out.print(" ");
			}
			k = k-2;
			for(int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
