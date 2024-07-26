/**
 * This class keeps track of transactions and when they processed. 
 * 
 * @author yousefsharif
 * @since 20200403
 */


package bank.process;

import java.time.LocalDate;

;

abstract class Transaction {
	// Attributes
	private String transactionId;
	private double amount;
	LocalDate date = LocalDate.now(); 
	
	// Constructor 
	public Transaction(double amount) {
		this.amount = amount;
		
	}
	
	// Setter and getters
	public String getTransactionId() {
		return transactionId;
	}
	
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public void setAmount(double amount) {
		this.amount = amount;
	}

	public LocalDate getDate() {
		return date;
	}
	
	public void setDate(LocalDate date) {
		this.date = date;
	}
	// Method to get the type of transaction
	public abstract String getType();
	
}
