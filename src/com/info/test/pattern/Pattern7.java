package com.info.test.pattern;

public class Pattern7 {
	public static void main(String[] args) {
		int num;
		for(int i = 0; i<5; i++) {
			num = 1;
			for(int j=0; j<=i; j++) {
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
	}

}
