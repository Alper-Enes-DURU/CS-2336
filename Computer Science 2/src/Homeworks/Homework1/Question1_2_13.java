/*
 * Financial Application: compound value
 * A simple program that calculates the account balance
 * with the monthly interest rate.
 * @author Alper Duru
 */

package Homeworks.Homework1;
import java.util.Scanner;

public class Question1_2_13 {

	public static void main(String[] args) {
		Scanner keybd = new Scanner(System.in);
		
		// Store the interest rate values
		double annualInterestRate = 0.05;
		double monthlyInterestRate = annualInterestRate / 12;
		double totalBalance = 0;
		
		// Prompt the user to enter the amount that'll be added monthly
		int monthlyPaymentAmnt;
		System.out.print("Enter the monthly saving amount: ");
		monthlyPaymentAmnt = keybd.nextInt();
		
		// Calculate the saving account balance after each month.
		// After first month of savings
		totalBalance += monthlyPaymentAmnt * (1 + monthlyInterestRate);
		
		// After second month of savings
		totalBalance = (monthlyPaymentAmnt + totalBalance) * (1 + monthlyInterestRate);

		// After third month of savings
		totalBalance = (monthlyPaymentAmnt + totalBalance) * (1 + monthlyInterestRate);
				
		// After fourth month of savings
		totalBalance = (monthlyPaymentAmnt + totalBalance) * (1 + monthlyInterestRate);
				
		// After fifth month of savings
		totalBalance = (monthlyPaymentAmnt + totalBalance) * (1 + monthlyInterestRate);
				
		// After sixth month of savings
		totalBalance = (monthlyPaymentAmnt + totalBalance) * (1 + monthlyInterestRate);
		
		// Print user the total balance after six months.
		System.out.printf("After the sixth month, the account value is $%.2f", totalBalance);
	}

}