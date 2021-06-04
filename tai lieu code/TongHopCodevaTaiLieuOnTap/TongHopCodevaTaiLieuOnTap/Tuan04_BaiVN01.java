
//Bai 01: 1d - 
/********************************************************
*                     Account                           *
*-------------------------------------------------------*
* -id: int                                              *
* -balance: double                                      *
* -annualInterestRate: double                           *
* ---------------------------                           *
* -dateCreated: String                                  *
* +Account()                                            *
* +Account(newid: int, newBalance: double)              *
* +setId(newId: int)                                    *
* +setBalance(newBalance: double)                       *
* +setAnnualInterestRate(newAnnualInterestRate: double) *
* +getId(): int                                         *
* +getBalance(): double                                 *
* +getAnnualInterestRate(): double                      *
* +getDateCreated(): String                             *
* +getMonthlyInterestRate(): double                     *
* +getMonthlyInterest(): double                         *
* +withdraw(amount: double)                             *
* +deposit(amount: double)                              *
********************************************************/

import java.util.Date;

class Account{
	//Data fields
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	//Constructor no-arg
	Account(){
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		dateCreated = new Date();
	}
	
	//Create an account with the specified id and initial balance
	Account(int newId, double newBalance){
		id = newId;
		balance = newBalance;
		dateCreated = new Date();
	}
	
	//Mutator method (Setter)
	public void setId(int newId){
		id = newId;
	}
	public void setBalance(int newBalance){
		balance = newBalance;
	}
	public void setAnnualInterestRate(double newAIR){
		annualInterestRate = newAIR;
	}
	
	//Accessor methods (getter)
	public int getId(){
		return id;
	}
	public double getBalance(){
		return balance;
	}
	public double getAnnualInterestRate(){
		return annualInterestRate;
	}
	
	//return dateCreated
	public String getDateCreated(){
		return dateCreated.toString();
	}
	
	//return monthly interest rate
	public double getMonthlyInterestRate(){
		return annualInterestRate/12;
	}
	
	//method: return monthly interest
	public double getMonthlyInterest(){
		return balance*(getMonthlyInterestRate()/100);
	}
	
	//Decrease balance by amount when you take money
	public void withdraw(double amount){
		balance -= amount;
	}
	
	//Increase balance by amount when you send money
	public void deposit(double amount){
		balance += amount;
	}
}

public class Tuan04_BaiVN01{
	public static void main (String[] args) {
		//Create an account objectt with an account ID of 1111, and balance of $20,000
		Account acc = new Account(1111, 20000);
		
		//set annual interest rate of 4.5%
		acc.setAnnualInterestRate(4.5);
		
		//Withdraw $2500
		acc.withdraw(2500);
		
		//Deposite $3000
		acc.deposit(3000);
		
		//Display the balance, the monthly interest, and the date when this account was created
		System.out.println("\n			Account Statement");
		System.out.println("*******************************************");
		System.out.println("Account ID: "+acc.getId());
		System.out.println("Date created: "+acc.getDateCreated());
		System.out.printf("Balance: $%.2f\n", acc.getBalance());
		System.out.printf("Monthly interest: $%.2f\n", acc.getMonthlyInterest());
	}
}