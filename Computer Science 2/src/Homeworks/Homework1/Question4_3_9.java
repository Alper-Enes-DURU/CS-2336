/*
 * Business: check ISBN-10
 * A simple program that calculates the tenth digit of the ISBN
 * number and prints the number with the tenth digit being either
 * "X" or any single digit.
 * @author Alper Duru
 */
package Homeworks.Homework1;
import java.util.Scanner;
import java.lang.Math;

public class Question4_3_9 {

	public static void main(String[] args) {
		Scanner keybd = new Scanner(System.in);
		
		int ISBN, remainingNumber;
		// Get the ISBN number with up to 9 digits
		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		ISBN = keybd.nextInt();
		
		// Assign each digit to use it later
		int d1 = ISBN / 100000000;
		remainingNumber = ISBN % 100000000;
		
		int d2 = remainingNumber / 10000000;
		remainingNumber %= 10000000;
		
		int d3 = remainingNumber / 1000000;
		remainingNumber %= 1000000;
		
		int d4 = remainingNumber / 100000;
		remainingNumber %= 100000;
		
		int d5 = remainingNumber / 10000;
		remainingNumber %= 10000;
		
		int d6 = remainingNumber / 1000;
		remainingNumber %= 1000;
		
		int d7 = remainingNumber / 100;
		remainingNumber %= 100;
		
		int d8 = remainingNumber / 10;
		remainingNumber %= 10;
		
		int d9 = remainingNumber;
		
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