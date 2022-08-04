import java.util.*;

public class Lecture8 {

	public static void main(String[] args) {
		Account acc = new Account(1122, 20000);
		acc.setAnnualInterestRate(4.5);
		acc.withdraw(2500);
		acc.deposit(3000);
		System.out.print(acc);
	}

}

class Account
{
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated;
	
	public Account()
	{
		Date d1 = new Date();
		dateCreated = d1;
	}
	public Account(int id_, double balance_)
	{
		setId(id_);
		setBalance(balance_);
		Date d2 = new Date();
		dateCreated = d2; 
	}
	public void setId(int id_)
	{
		id = id_;
	}
	public void setBalance(double balance_)
	{
		balance = balance_;
	}
	public void setAnnualInterestRate(double annualInterestRate_)
	{
		annualInterestRate = annualInterestRate_;
	}
	public int getId()
	{
		return id;
	}
	public double getBalance()
	{
		return balance;
	}
	public double getAnnualInterestRate()
	{
		return annualInterestRate;
	}
	public Date getDateCreated()
	{
		return dateCreated;
	}
	public double getMonthlyInterestRate()
	{
		return (annualInterestRate / 100);
	}
	public double getMonthlyInterest()
	{
		return balance * (getMonthlyInterestRate() / 12);
	}
	public void withdraw(double amount)
	{
		setBalance(balance -= amount);
	}
	public void deposit(double amount)
	{
		setBalance(balance += amount);
	}
	
	@Override
	public String toString() {
		return
		"Balance is " + getBalance() + "\n" +
		"Monthly interest is " + getMonthlyInterest() +
		"\nThis account was created at " +
		getDateCreated();
	}
}
