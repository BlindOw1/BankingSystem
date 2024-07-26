/*
 * This is the main class that proceeds everything. 
 * 
 * 
 * @author yousefsharif
 * @since 20200403
 */

package bank.process;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// Create a new user
		User user = new User();
		
		System.out.println("Enter User ID: ");
		user.setUserId(scanner.nextLine());
		System.out.println("Enter Name: ");
		user.setName(scanner.nextLine());
		System.out.println("Enter Email: ");
		user.setEmail(scanner.nextLine());
		
		
		// Create a new account for the user
		Account account = user.createAccount();
		System.out.println("Enter Account ID: ");
		account.setAccountId(scanner.nextLine());
		
		// Perform deposit and withdrawal
		while (true) {
			System.out.println("\nChoose from the options below: "
					+ "\n1. Deposit"
					+ "\n2. Withdraw"
					+ "\n3. View Account Details: "
					+ "\n4. Exit"
					+ "\nEnter your choice: ");
			int choice = scanner.nextInt();
			// Switch statement to give user options 
			switch(choice) {
			case 1:
				System.out.println("Enter deposit amount: ");
				double depositAmount = scanner.nextDouble();
				account.deposit(depositAmount);
				break;
			case 2:
				System.out.println("Enter withdraw amount: ");
				double withdrawAmount = scanner.nextDouble();
				account.withdraw(withdrawAmount);
				break;
			case 3:
				System.out.println("Account ID: " + account.getAccountId()
				+ "\nBalance: " + account.getBalance() + "$"
				+ "\n\nTransactions: ");
				for (Transaction transaction : account.getTransaction()) {
					System.out.println("\nType: " + transaction.getType()
					+ "\nAmount: " + transaction.getAmount() + "$" 
					+ "\nDate: " + transaction.getDate());
				}
				break;
			case 4: 
				System.out.println("Exiting...");
				scanner.close();
				return;
			default:
				System.out.println("Invalid choice. Please try again!");
			}
		}
		
		

	}

}
