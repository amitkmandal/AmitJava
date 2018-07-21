package com.info.test;

import java.sql.SQLTransactionRollbackException;
import java.util.Scanner;

/*
 * program to find the HCF and LCM of two numbers.
 */

public class HCFLCM {
	public static void main(String[] args) {
		int a,b,x,y, temp,gcd,lcm;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two number: ");
		x = scanner.nextInt();
		y = scanner.nextInt();
		a = x;
		b = y;
		while(b != 0) {
			temp = b;
			b = a%b;
			a = temp;
		}
		/*
		 * Another logic
		 * --------------
		 * while(a != b){
		 * 	if(a > b){
		 * 		a = a-b;
		 * 	}
		 * 	else{
		 * 		b = b-a;
		 * 	}
		 * }
		 * gcd = a;
		 */
		gcd = a;
		lcm = (x * y)/gcd;
		
		System.out.println("HCF = "+gcd+" LCM = "+lcm);
		scanner.close();
	}

}
