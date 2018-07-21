package com.info.string;

import java.util.Scanner;

public class RemoveSpace {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String string = scanner.nextLine();
		
		//removing the space using replaceAll()
		String withOutSpace = string.replaceAll(" ", "");
		System.out.println(withOutSpace);
		
		//without using replaceAll()
		char[] strArray = string.toCharArray();
		StringBuffer sb = new StringBuffer();
		
		for(int i = 0; i < strArray.length; i++) {
			if((strArray[i] != ' ') && (strArray[i] != '\t')) {
				sb.append(strArray[i]);
			}
		}
		System.out.println(sb);
		scanner.close();
	}

}
