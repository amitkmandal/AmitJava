package com.info.test;

import java.util.Arrays;

public class FirstProgram {
	public static void main(String[] args) {
		/*http://www.java2novice.com/--For logic building and searching and sorting program*/
		//System.out.println("hello world");
		int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 12;
		arr[2] = 15;
		arr[3] = 20;
		arr[4] = 50;
		System.out.println(Arrays.toString(arr));
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
		for(int ii : arr) {
			System.out.print(ii);
		}
		System.out.println();
		for(int i = arr.length-1; i >= 0 ; i--) {
			System.out.println(arr[i]);
		}
	}

}
