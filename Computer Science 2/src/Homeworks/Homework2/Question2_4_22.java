/*
 * Check Substring
 * A program that finds out whether the second string
 * is a substring of the first string.
 * @author Alper Duru
 */

import java.util.Scanner;

public class Question2_4_22 {

	public static void main(String[] args) {
		
		// Read the 2 strings from user
		Scanner keybd = new Scanner(System.in);
		String s1 = keybd.next();
		String s2 = keybd.next();
		
		// It is substring if it has index not -1
		if (s1.indexOf(s2) != -1)
		{
			System.out.println("String 2 is a substring");
			
		}
		else // Otherwise
		{
			System.out.println("String 2 is not a substring");
		}
	}

}
