package com.info.test.pattern;


public class Pattern2 {
	public static void main(String[] args) {
		int k = 1;
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < k; j++ ) {
				System.out.print("* ");
			}
			k = k+2;
			System.out.println();
		}
	}

}
