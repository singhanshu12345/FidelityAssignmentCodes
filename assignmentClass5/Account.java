package assignmentClass5;

import java.util.Random;
import java.util.Scanner;

public abstract class Account {
	int accountNumber;
	String customerName;
	String accountType;
	double amount=10;
	double balance=0;
	final double minBalance=10000;
	
	abstract void withdraw(double amt);
	abstract double deposit(double amt);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SavingAccount sa1=new SavingAccount(); 
		
		//Generating the random account number
		Random rand = new Random();
		int upperBound = 1000;
		int ran_acctNumber = rand.nextInt(upperBound);
		
		//Taking the input from user
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the name of the customer: ");
		String name = in.nextLine();
		System.out.println("Enter the type of account want to open: ");
		String accountType = in.nextLine();
		System.out.println("Enter the amount want to deposit: ");
		double bal = in.nextDouble();
		sa1.deposit(bal);
		sa1.insertCustomer(ran_acctNumber, name, accountType, bal);
		System.out.println("Enter the amount want to be withdrawn: ");
		double withdrawAmt = in.nextDouble();
		sa1.withdraw(withdrawAmt);
		
		
	}
	public void insertCustomer(int accntNum,String name,String acctType,double bal) {
		this.accountNumber=accntNum;
		this.customerName=name;
		this.accountType=acctType;
		this.balance=bal;
		
		System.out.println(accountType+" account got created for "+customerName+" with account nuber as "+accountNumber+" having the initial balance as "+balance);
	}
	
	public int interest() {
		System.out.println("The standard interest rate is 5%");
		return 5;
	}
}
class SavingAccount extends Account{
	public void withdraw(double amt) {
		if(balance<=amt || balance<0)
			System.out.println("Dont have enough money to withdraw");
		else {
			balance=balance-amt;
			System.out.println(balance);
		}
	}
	public double deposit(double amt) {
		balance=balance+amt;
			
		if(balance<minBalance) {
			System.out.println("The balance is too low");
		}
		return balance;
	}
	public int interest() {
		return 7;
	}
}
class CurrentAccount extends Account{
	public int interest() {
		return 8;
	}
	public void withdraw(double amt) {
		if(balance<=0)
			System.out.println("Dont have enough money to withdraw");
		else {
			balance=balance-amount;
			System.out.println(balance);
		}
	}
	public double deposit(double amt) {
		balance=balance+amt;
		return balance;
	}
}
