package com.info.test;
/*
 * program to print 1-45 in two dimesion.
 * */
public class SampleProgram2 {
	public static void main(String[] args) {
		int n =1;
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(n+" ");
				n++;
			}
			System.out.println();
		}
	}

}
