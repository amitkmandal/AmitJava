package com.info.test;
/*
 * program to print 1-100 in two dimension.
 * */
public class SampleProgram1 {
	public static void main(String[] args) {
		int n = 1;
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				System.out.print(n+" ");
				n++;
			}
			System.out.println();
		}
	}

}
