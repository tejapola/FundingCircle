package com.fundingcircle.table.util;

public class TableUtil {

	public static String addSpaces(int inputNumber) {
		String outputString = new String();
		if (inputNumber < 10)
			outputString = "  " + inputNumber;
		else if (inputNumber < 100)
			outputString = " " + inputNumber;
		else
			outputString = "" + inputNumber;
		return outputString;
	}

	// checks whether a number is prime or not.
	public boolean checkPrime(int number) {
		for (int i = 2; i*2 < number; i++) {
			if (number % i == 0)
				return false;
		}
		return true;
	}

}
