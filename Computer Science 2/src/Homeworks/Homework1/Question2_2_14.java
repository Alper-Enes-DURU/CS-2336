/*
 * Health Application: computing BMI
 * A simple program that calculates the BMI (Body Mass Index)
 * with the given pounds and inches. The program concerts these
 * two values to kilograms and meters for calculation.
 * @author Alper Duru
 */
package Homeworks.Homework1;
import java.util.Scanner;
import java.lang.Math;

public class Question2_2_14 {

	public static void main(String[] args) {
		Scanner keybd = new Scanner(System.in);
		
		// Initialize the conversion values.
		final double poundToKg = 0.45359237;
		final double inchToMeter = 0.0254;
		double BMI;
		
		// Prompt the user for pounds and inches
		double pounds;
		System.out.print("Enter weight in pounds: ");
		pounds = keybd.nextDouble();
		
		double inches;
		System.out.print("Enter height in inches: ");
		inches = keybd.nextDouble();
		
		// Calculate the BMI, and print the result
		BMI = (pounds * poundToKg) / (Math.pow(inches * inchToMeter, 2));
		System.out.printf("BMI is %.4f", BMI);
	}
}