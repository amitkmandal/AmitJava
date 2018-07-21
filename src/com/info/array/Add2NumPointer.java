package com.info.array;

import java.util.Scanner;

/*
 * program of adding two number using pointer.
 */

public class Add2NumPointer {
	public static void main(String[] args) {
		int sum = 0;
		IntObj ptr1;
		IntObj ptr2;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter two numbers: ");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		
		ptr1 = new IntObj();
		ptr2 = new IntObj();
		
		ptr1.value =  num1;
		ptr2.value = num2;
		
		sum = ptr1.value + ptr2.value;
		
		System.out.print("Sum of two number is: "+sum);
		
		scanner.close();
	}

}
