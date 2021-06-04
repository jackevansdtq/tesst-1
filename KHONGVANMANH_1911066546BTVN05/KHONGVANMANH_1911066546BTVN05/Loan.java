/**
 * @(#)Loan.java
 *
 *
 * @author 
 * @version 1.00 2021/4/16
 */

import java.util.Date;
import java.util.Scanner;
public class Loan {
	private double annualInterestRate;
	private int numberOfYears;
	private double loanAmount;
	private Date loanDate;
    public Loan() {
    	annualInterestRate = 1;
    	numberOfYears = 1;
    	loanAmount = 1;
    	loanDate = new Date();
    }
    public Loan(double a, int n, double l){
    	setAnnualInterestRate(a); //anual.. = a; + dieu kien >0
    	setNumberOfYears(n);
    	setLoanAmount(l);
    	loanDate = new Date();
    }
    public double getAnnualInterestRate(){
    	return annualInterestRate;
    }
    public int getNumberOfYears(){
    	return numberOfYears;
    }
    public double getLoanAmount(){
    	return loanAmount;
    }
    public Date getLoanDate(){
    	return loanDate;
    }
    public void setAnnualInterestRate(double a){
    	annualInterestRate = a;
    	if(annualInterestRate <= 0)
    	{
    		throw new IllegalArgumentException("bad percent");
    	}
    }
    public void setNumberOfYears(int n){
    	numberOfYears = n;
    	if(numberOfYears <= 0)
    	{
    		throw new IllegalArgumentException("bad percent");
    	}
    }
    public void setLoanAmount(double l){
    	loanAmount = l;
    	if(loanAmount <= 0)
    	{
    		throw new IllegalArgumentException("bad percent");
    	}
    }
    public double getMonthlyPayment(){
    	return loanAmount/12;
    }
    public double getTotalPayment(){
    	return getMonthlyPayment() +1;
    }
}
class TestLoanClass{
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println ("Nhap vao Annual, number, loan amount > 0");
		System.out.println ("Nhap Annual");
		double annual = sc.nextDouble();
		System.out.println ("Nhap number: ");
		int number = sc.nextInt();
		System.out.println ("Nhap loan amount: ");
		double lAmount = sc.nextDouble();
		Loan loan = new Loan(annual, number, lAmount);
		System.out.println ("Ngay muon: " + loan.getLoanDate().toString());
    }
}