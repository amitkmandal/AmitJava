package com.info.test.pattern;

public class Pattern5 {
	public static void main(String[] args) {
		int k = 16, tim=1;
		for(int i = 0; i < 5; i++) {
			for(int j=0; j<k; j++) {
				System.out.print(" ");
			}
			k = k-4;
			for(int j = 0; j <tim; j++) {
				System.out.print("* ");
			}
			tim = tim+2;
			System.out.println();
		}
	}

}
