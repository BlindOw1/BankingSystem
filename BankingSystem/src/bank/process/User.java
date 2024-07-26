/**
 * This class makes a user account and puts them in an arraylist.
 * 
 * @author yousefSharif
 * @since 20200403
 */

package bank.process;

import java.util.ArrayList;

public class User {
	// Attributes
	private String userId;
	private String name;
	private String email; 
	private ArrayList<Account> accounts;
	// Constructor
	public User() {
		this.accounts = new ArrayList<>();
	}
	
	// Setters and getters
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public ArrayList<Account> getAccount(){
		return accounts;
	}
	// Creating a new account
	public Account createAccount() {
		Account account = new Account();
		accounts.add(account);
		return account;
	}
	
}



