package com.info.test.number.conversion;

import java.util.Scanner;

public class BinaryToOctal {
	public static void main(String[] args) {
		int binNum,quot,i=1;
		int[] octNum = new int[100];
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Binary Number: ");
		binNum = scanner.nextInt();
		
		quot=binNum;
		while (quot > 0) {
			octNum[i++] = quot%8;
			quot = quot/8;
		}
		System.out.print("Eqivalent octal value of "+binNum+" is:\n");
		for(int j=i-1; j>0; j--) {
			System.out.print(octNum[j]);
		}
		
		scanner.close();
	}

}
