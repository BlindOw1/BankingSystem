/*
 * This program is to store account information.
 * 
 * 
 * @author yousefsharif
 * @since 20200403
 */
package bank.process;

import java.util.ArrayList;

public class Account {
	// Attributes
	private String accountId;
	private double balance;
	private ArrayList<Transaction> transaction;
	
	// Constructor
	public Account() {
		this.transaction = new ArrayList<>();
		this.balance = 0.0;
	}
	
	// Setters and getters
	public String getAccountId() {
		return accountId;
	}
	
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public ArrayList<Transaction> getTransaction(){
		return transaction;
	}
	
	// Deposit method
	public void deposit(double amount) {
		Deposit deposit = new Deposit(amount);
		transaction.add(deposit);
		balance += amount;
	}
	
	// Withdraw method
	public void withdraw(double amount) {
		if(amount <= balance) {
		Withdrawal withdraw = new Withdrawal(amount);
		transaction.add(withdraw);
		balance -= amount;
		}else {
			System.out.println("Insufficient Balance!"); 
		}
	}
	
}
