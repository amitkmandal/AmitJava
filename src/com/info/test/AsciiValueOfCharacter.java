package com.info.test;
/*
 * program to print ASCII value of character.
 */

public class AsciiValueOfCharacter {
	public static void main(String[] args) {
		String ch;
		for(int i = 0; i <= 255; i++) {
			ch = new Character((char)i).toString();
			System.out.println(i+" --->>  "+ch+"\t");
		}
		
	}

}
