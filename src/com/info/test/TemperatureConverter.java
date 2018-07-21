package com.info.test;

import java.util.Scanner;

/*
 * program to cover temperature Fahrenheit to celcius.
 */

public class TemperatureConverter {
	public static void main(String[] args) {
		float faren;
		double cel;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the temperature in fahreinheit :");
		faren = scanner.nextFloat();
		cel = (faren-32)/1.8;
		System.out.println(faren+" F"+" equivalent temperature in celcius is "+cel+" C");
		scanner.close();
	}

}
