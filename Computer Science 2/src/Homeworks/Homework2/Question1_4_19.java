/*
 * Business: check ISBN-10
 * Rewrite the programming exercise 3.9 by entering the
 * ISBN number as a string
 * @author Alper Duru
 */

import java.util.Scanner;

public class Question1_4_19 {

	public static void main(String[] args) {		
		
		// Retrieve the number as string
		System.out.print("Enter the first 9 digits of an ISBN: ");
		String ISBN = (new Scanner(System.in)).nextLine();
		
		// Get each digit by char
		int d9 = ISBN.charAt(8) - '0';
		int d8 = ISBN.charAt(7) - '0';
		int d7 = ISBN.charAt(6) - '0';
		int d6 = ISBN.charAt(5) - '0';
		int d5 = ISBN.charAt(4) - '0';
		int d4 = ISBN.charAt(3) - '0';
		int d3 = ISBN.charAt(2) - '0';
		int d2 = ISBN.charAt(1) - '0';
		int d1 = ISBN.charAt(0) - '0';
		
		// Calculate the tenth digit.
		int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 +
				   d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
		
		System.out.print("The ISBN-10 number is " + ISBN);
		
		// Print the number, whether it is 0 or any other single digit.
		if (d10 == 10)
			System.out.print("X");
		else
			System.out.print(d10);
	}
}
