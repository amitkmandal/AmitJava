package com.info.test.pattern;

public class Pattern4 {
	public static void main(String[] args) {
		int k = 0;
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < k; j++) {
				System.out.print(" ");
			}
			k = k+2;
			for(int j = i; j < 5; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
