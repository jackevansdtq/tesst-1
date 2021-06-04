/**
 * @(#)Tuan04_BaiVN03.java
 *
 *
 * @author Phan Duc Tri
 * @version 1.00 2021/4/17
 */
 
 //Transaction có UML trong bai nen minh chi ve UML cho Account moi
/*********************************************************
*                     Account                            *
*--------------------------------------------------------*
* -name: String                                          *
* -id: int                                               *
* -balance: double                                       *
* -annualInterestRate: double                            *
* ---------------------------                            *
* -dateCreated: String                                   *
* -transactions: ArrayList<Transaction>                  *
* +Account()                                             *
* +Account(id: int, balance: double)               		 *
* +Account(name: String, id: int, balance: double) 		 *
* +setId(id: int)                                     	 *
* +setBalance(balance: double)                           *
* +setAnnualInterestRate(annualInterestRate: double)  	 *
* +getId(): int                                          *
* +getBalance(): double                                  *
* +getAnnualInterestRate(): double                       *
* +getDateCreated(): String                              *
* +getMonthlyInterestRate(): double                      *
* +getMonthlyInterest(): double                          *
* +withdraw(amount: double)                              *
* +deposit(amount: double)                               *
*********************************************************/
 
import java.util.Date;
import java.util.ArrayList;

public class Tuan04_BaiVN03 {
        
    /**
     * Creates a new instance of <code>Tuan04_BaiVN03</code>.
     */
    public Tuan04_BaiVN03() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create an Account object
		Account acc = new Account("DucTri", 1320, 1000);
		
		//Set annual interest rate to 1.5%
		acc.setAnnualInterestRate(1.5);
		
		//Deposit $30, $40 and $50 to the account
		acc.deposit(30);
		acc.deposit(40);
		acc.deposit(50);
		
		//Withdraw $5, $4 and $2 from the account
		acc.withdraw(5);
		acc.withdraw(4);
		acc.withdraw(2);
		
		System.out.println("\n			Account Statement");
		System.out.println("*******************************************");
		System.out.println("Account holder name: "+acc.getName());
		System.out.println("Account ID: "+acc.getId());
		System.out.println("Date created: "+acc.getDateCreated());
		System.out.println("Interest rate: "+acc.getAnnualInterestRate());
		System.out.printf("Balance: $%.2f\n", acc.getBalance());
		System.out.printf("Monthly interest: $%.2f\n", acc.getMonthlyInterest());
		System.out.println("\n			List of transactions");
		System.out.println("--------------------------------------------");
		for(int x = 0; x < acc.getTransactions().size(); x++){
			System.out.printf("Transaction %d: \n", (x+1));
			System.out.println("Date: "+ (acc.getTransactions()).get(x).getDate());
			System.out.println("Type: "+ (acc.getTransactions()).get(x).getType());
			System.out.println("Amount: "+ (acc.getTransactions()).get(x).getAmount());
			System.out.println("Balance: "+ (acc.getTransactions()).get(x).getBalance());
			System.out.println("Description: "+ (acc.getTransactions()).get(x).getDescription());
			System.out.println();
    }
}


//Transaction
class Transaction{
	//data field
	private Date date;
	private char type;
	private double amount;
	private double balance;
	private String description;
	
	//Constructor with specified date, type, balance and description
	public Transaction(char type, double amount, double balance, String description){
		date = new Date();
		this.type = type;
		this.amount = amount;
		this.balance = balance;
		this.description = description;
	}
	
	//method getDate
	public String getDate(){
		return date.toString();
	}
	
	//set a new type
	public void setType(char type){
		this.type = type;
	}
	
	//return type
	public char getType(){
		return type;
	}
	
	//Set new amount
	public void setAmount(double amount){
		this.amount = amount;
	}
	
	//get amount
	public double getAmount(){
		return this.amount;
	}
	
	//Set a new balance
	public void setBalance(double balance){
		this.balance = balance;
	}
	
	//Return balance
	public double getBalance(){
		return this.balance;
	}
	
	//Set a new description
	public void setDescription(String des){
		this.description = des;
	}
	
	//return description
	public String getDescription(){
		return this.description;
	}
		
}


//Account
class Account{
	//Data field
	private String name;
	private int id;
	private double balance;
	private static double annualInterestRate;
	private Date dateCreated;
	private ArrayList<Transaction> transactions;
	
	//Constructor default
	Account(){
		name = "";
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		dateCreated = new Date();
		transactions = new ArrayList<Transaction>();
	}
	
	//Create an account with the specified id and initial balance
	Account(int id, double balance){
		name = "";
		this.id = id;
		this.balance = balance;
		dateCreated = new Date();
		transactions = new ArrayList<Transaction>();
	}
	
	//Create an account with specified name, id and initial balance
	Account(String name, int id, double balance){
		this(id, balance);
		this.name = name;
	}
	
	//Set new name
	public void setName(String name){
		this.name = name;
	}
	
	//Return name
	public String getName(){
		return name;
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
		transactions.add(new Transaction('W', amount, balance, "Withdraw from account"));
	}
	
	//Increase balance by amount when you send money
	public void deposit(double amount){
		balance += amount;
		transactions.add(new Transaction('D', amount, balance, "Deposit to account"));	
	}
	
	//return transactions
	public ArrayList<Transaction> getTransactions(){
		return transactions;
	}
}

