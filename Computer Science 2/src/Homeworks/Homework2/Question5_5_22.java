/*
 * Financial Application: loan amortization schedule
 * A program that calculates the amortization schedule
 * for the loan.
 * @author Alper Duru
 */

import java.util.Scanner;
import java.lang.Math;

public class Question5_5_22 {

	public static void main(String[] args) {
		Scanner keybd = new Scanner(System.in);
		
		// Get the values from user
		System.out.print("Loan Amount: ");
		Double loanAmount = keybd.nextDouble();
		
		System.out.print("Number of years: ");
		Integer numOfYears = keybd.nextInt();
		
		System.out.print("Annual Interest Rate: ");
		Double annualInterestRate = keybd.nextDouble();
		
		// Calculate loan metrics
		Double monthlyInterestRate, monthlyPayment, totalPayment;
		monthlyInterestRate = annualInterestRate/1200;
		monthlyPayment = loanAmount*monthlyInterestRate / (1 - (Math.pow(1 / (1 + monthlyInterestRate), numOfYears * 12)));
		totalPayment = (int)(monthlyPayment * 12 * numOfYears * 100) / 100.0;

		// Print payment amounts
		System.out.println("Monthly Payment: " + (int)(monthlyPayment * 100) / 100.0 );
		System.out.println("Total Payment: " + totalPayment + "\n" );

		Double interest, principal, balance = totalPayment;
		// Display the header
		System.out.printf("%-15s%-15s%-15s%-15s\n", "Payment#", "Interest", "Principal", "Balance");
		for (int i = 1; i <= numOfYears * 12; i++) {
			  // Calculate the values for each month
		      interest = monthlyInterestRate * balance;
		      principal = monthlyPayment - interest;
		      balance = balance - principal;
		      System.out.printf("%-15d%-15.2f%-15.2f%-15.2f\n", i, interest, principal, balance);
		}
	}

}
