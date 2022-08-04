/*
 * Financial Application: Payroll
 * A program that prints the payroll information.
 * @author Alper Duru
 */

import java.util.Scanner;

public class Question3_4_23 {

	public static void main(String[] args) {
		
		Scanner keybd = new Scanner(System.in);
		
		// Read user information from the console
		System.out.print("Enter employee's name: ");
		String name = keybd.nextLine();
		
		System.out.print("Enter number of hours worked in a week: ");
		Double hours = keybd.nextDouble();
		
		System.out.print("Enter hourly pay rate: ");
		Double payRate = keybd.nextDouble();
		
		System.out.print("Enter federal tax witholding rate: ");
		Double federalRate = keybd.nextDouble();
		
		System.out.print("Enter state tax witholding rate: ");
		Double stateRate = keybd.nextDouble();
		
		Double grossPay, fedTaxWithholding, stateTaxWithholding, 
			   totalDeduction, netPay;
		
		// Calculate the variables for payroll information
		grossPay = hours * payRate;
		fedTaxWithholding = grossPay * federalRate;
		stateTaxWithholding = grossPay * stateRate;
		totalDeduction = fedTaxWithholding + stateTaxWithholding;
		netPay = grossPay - totalDeduction;
		
		// Print the payroll information
		System.out.println("\nEmployee Name: " + name);
		System.out.printf("Hours Worked: %.2f", hours);
		System.out.printf("\nPay Rate: $%.2f", payRate);
		System.out.printf("\nGross Pay: $%.2f", grossPay);
		System.out.println("\nDeductions:");
		System.out.printf("  Federal Witholding (%.2f%%): $%.2f", federalRate * 100, fedTaxWithholding);
		System.out.printf("\n  State Witholding (%.1f%%): $%.2f", stateRate * 100, stateTaxWithholding);
		System.out.printf("\n  Total Deduction: $%.2f", totalDeduction);
		System.out.printf("\nNet Pay: $%.2f", netPay);
	}
}
