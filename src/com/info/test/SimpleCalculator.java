package com.info.test;

import java.util.Scanner;
/*
 * program for simple calculator. 
 * */
public class SimpleCalculator {
	public static void main(String[] args) {
		char choice;
		float a, b;
		double res;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("1. Addition\n");
			System.out.println("2. Substraction\n");
			System.out.println("3. Multiplication\n");
			System.out.println("4. Division\n");
			System.out.println("5. Exit\n\n");
			System.out.println("Enter your choice : ");
			choice = scanner.next().charAt(0);
			switch (choice) {
			case '1':System.out.println("Enter Two Number :");
				a = scanner.nextFloat();
				b = scanner.nextFloat();
				res = a+b;
				System.out.println("Result = "+ res);
				break;
				
			case '2':System.out.println("Enter Two Number :");
				a = scanner.nextFloat();
				b = scanner.nextFloat();
				res = a-b;
				System.out.println("Result = "+res);
				break;
				
			case '3':System.out.println("Enter Two Number :");
				a = scanner.nextFloat();
				b = scanner.nextFloat();
				res = a * b;
				System.out.println("Result = "+res);
				break;
			
			case '4':System.out.println("Enter Two Number : ");
				a = scanner.nextFloat();
				b = scanner.nextFloat();
				if(b==0) {
					System.out.println("----Math Error----");
				}
				else {
					res = a/b;
					System.out.println("Result = "+res);
				}
				break;
				
			case '5':System.exit(0);
				break;

			default: System.out.println("----Wrong choice----");
				break;
			}
			System.out.println("\n------------------------------------\n");
			
		}while(choice != 5);
	}

}
