/*
 * command line argument  program
 */

package com.info.array;

public class Debug {
	static int i;
	static int j;
	static int sum = 0;
	
	public static void main(String[] args) {
		//int i,j,sum = 0;
		sum = i+j;
		i = Integer.parseInt(args[0]);
		j = Integer.parseInt(args[1]);
		sum = i + j;
		System.out.println("sum of i and j "+ sum);
		
	}

}
