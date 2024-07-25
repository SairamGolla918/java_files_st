package A14;

import java.util.Scanner;

class  InsufficientFundsException extends Exception
{
	String message;
	 InsufficientFundsException(String message)
	{
		this.message = message;
	}
	
}


class  InvalidAccountException extends Exception
{
	String message;
	InvalidAccountException(String message)
	{
		this.message = message;
	}
}

class BankAccount
{
	String arr[] = {"35260941951","35260941952","35260941953","35260941954","35260941955"};
	boolean arr1[] = new boolean[5];
	String accountNumber;
	double balance;
	BankAccount(String accountNumber,double balance)
	{
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	double deposit(double amount)
	{
		if(amount>1)
			balance = balance + amount;
		return balance;
	}
	double withdraw(double amount) throws Exception
	{
		if(amount < balance)
		{
			balance = balance - amount;
			return balance;
		}
		else
		{
			throw new InsufficientFundsException("No sufficient funds");
		}
	}
	
	void validateAccount(String accountNumber) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		boolean valid = false; 
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 0; j < arr.length; j++) 
			{
				if(arr[j].equals(accountNumber))
					arr1[j] = true;	
			} 
			
			if(arr1[i])
				valid = true;
		}	
		if(valid)
		{
			try 
			{
				System.out.println("Valid Account Number");
				System.out.println();
				System.out.println("Enter the Amount to Deposit");
				double amount = sc.nextDouble();
				System.out.println("Deposited successfully !! balance " + deposit(amount));
				System.out.println();
				System.out.println("Enter the Amount to Withdraw");
				double amount2 = sc.nextDouble();
				System.out.println(withdraw(amount2));
			}
			catch(Exception e)
			{
				System.out.println("Withdrawal amount exceeds available balance is "+ balance);
				//e.printStackTrace();
			}
		}	
		else
			throw new InvalidAccountException("InValid Account Number");
	}
	void validateAccount1(String accountNumber) throws Exception
	{
		boolean valid = false; 
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 0; j < arr.length; j++) 
			{
				if(arr[j].equals(accountNumber))
					arr1[j] = true;	
			} 
			
			if(arr1[i])
				valid = true;
		}	
		if(this.accountNumber == accountNumber)
		{
			System.out.println("Valid Account Number");
		}
		else
			
			throw new InvalidAccountException("InValid Account Number");
	}
	
}

public class BankApplication
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Account Number: ");
		String AccountNumber = sc.next();
		BankAccount obj1 = new BankAccount(AccountNumber,1000.0);
		
		try
		{
			obj1.validateAccount( AccountNumber);
		}
		catch(Exception e)
		{
			e.printStackTrace();	
		}
		finally 
		{
			System.out.println("Enter the Account Number to Validate: ");
			String AccountNumber2 = sc.next();
			try 
			{
			obj1.validateAccount1(AccountNumber2 );
			}
			catch(Exception e)
			{
				System.out.println("InValid Account Number");
				//e.printStackTrace();
			}
			System.out.println();
			System.out.println("Transaction Successful");
		}
		
		System.out.println("Thank you");
		
	}
}






















//Task-1 (Banking Context)
//You are required to create two custom exceptions: InsufficientFundsException and 
//InvalidAccountException. These exceptions should be used to handle specific error 
//conditions in a banking application that simulates basic operations like withdrawal and 
//deposit.
//Steps to Follow:
//1. Define the Custom Exceptions:
//o InsufficientFundsException: Create a new class named 
//InsufficientFundsException that extends the Exception class.
//▪ Implement a constructor that accepts a string message and passes it to 
//the superclass constructor.
//o InvalidAccountException: Create another class named 
//InvalidAccountException that extends the Exception class.
//▪ Implement a constructor that accepts a string message and passes it to 
//the superclass constructor.
//2. Create the Banking Operations Program:
//o BankAccount Class:
//▪ Create a class named BankAccount with the following properties:
//▪ String accountNumber
//▪ double balance
//▪ Implement the following methods:
//▪ deposit(double amount): Adds the specified amount to the 
//account balance. Ensure that the deposit amount is positive.
//▪ withdraw(double amount): Deducts the specified amount 
//from the account balance. Ensure that the withdrawal amount is 
//positive and that the account has sufficient funds. If not, throw 
//an InsufficientFundsException.
//▪ validateAccount(String accountNumber): Checks if the 
//given account number matches the account’s number. If not, 
//throw an InvalidAccountException.
//▪ Ensure proper encapsulation by providing getters and setters for the 
//properties.
//3. Handle the Exceptions in the Main Program:
//o BankApplication Class:
//▪ Create a main method that simulates user interactions with the bank 
//account.
//▪ Prompt the user to enter an account number, deposit amount, and 
//withdrawal amount.
//▪ Instantiate a BankAccount object and use the provided inputs to 
//perform deposit and withdrawal operations.
//▪ Use try-catch blocks to handle InsufficientFundsException and 
//InvalidAccountException.
//▪ Display appropriate error messages in the catch blocks to inform the 
//user of invalid operations.
//4. Program Requirements:
//o Custom Exception Classes: Must define InsufficientFundsException and 
//InvalidAccountException with constructors that accept messages.
//o BankAccount Class: Must implement methods to handle deposit, withdrawal, 
//and account validation, throwing exceptions for invalid operations.
//o Main Method: Must handle user input, call the bank account methods, and 
//properly handle exceptions to guide the user towards valid operations