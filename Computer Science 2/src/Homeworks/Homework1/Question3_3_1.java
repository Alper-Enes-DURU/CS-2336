/*
 * Algebra: solve quadratic equations
 * A simple program that calculates the roots of the 
 * quadratic equation. It prints the roots, if any, based
 * on the discriminant value.
 * @author Alper Duru
 */
package Homeworks.Homework1;
import java.util.Scanner;
import java.lang.Math;

public class Question3_3_1 {

	public static void main(String[] args) {
		Scanner keybd = new Scanner(System.in);
		
		double a, b, c;
		double discriminant;
		System.out.print("Enter a, b, c: ");
		
		// Get the values from the user for solving the equation.
		a = keybd.nextDouble();
		b = keybd.nextDouble();
		c = keybd.nextDouble();
		
		// Calculate the discriminant
		discriminant = (Math.pow(b, 2) - (4 * a * c));
		
		if (discriminant > 0) // There are two roots
		{
			double r1, r2;
			r1 = (-b + (Math.pow(discriminant, 0.5))) / (2 * a);
			r2 = (-b - (Math.pow(discriminant, 0.5))) / (2 * a);
			System.out.printf("The equation has two roots %.6f and %.5f", r1, r2);
		}
		else if (discriminant == 0) // There is only 1 root
		{
			double r;
			r = (-b / (2 * a));
			System.out.printf("The equation has one root " + r);
		}
		else // No possible solution in real numbers
		{
			System.out.print("The equation has no real roots");
		}		
	}
}