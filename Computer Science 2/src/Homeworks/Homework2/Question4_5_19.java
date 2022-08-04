/*
 * Display numbers in a pyramid pattern
 * A program that includes a nested loop to print
 * a binary tree.
 * @author Alper Duru
 */

public class Question4_5_19 {

	public static void main(String[] args) {
		// Variables to manage the space
		int start = 0, end = 7;
			
		// Loop over until it reaches to 128 in the binary tree
		for (int row = 1; row <= 128; row += row) {
			
			// Display white space between numbers
			for (int beginning = 0; beginning < end; beginning++) {
				System.out.print("    ");
			}
			
			// Display ascending numbers
			for (int asc = 1; asc <= row; asc += asc) {
				System.out.printf("%4d", (asc));
			}
			// Display descending numbers
			for (int desc = start; desc > 0 ; desc /= 2 ) {
				System.out.printf("%3d", (desc));	
			}
				
			// Print a new line to show the binary tree in order.
			System.out.println();
			
			end--;
			start = row;
		}
	}
}
