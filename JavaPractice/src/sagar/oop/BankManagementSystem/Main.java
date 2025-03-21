package oop.BankManagementSystem;

/**
 * Main class to test the banking system.
 */

public class Main {
    public static void main(String[] args) {
        try {
            // Create bank instance
            Bank bank = new Bank();
            // Create Accounts
            SavingsAccount savings =new SavingsAccount("SA759", "Sagar Vijay", 500);
            CheckingAccount checking = new CheckingAccount("CA789", "Vijay Sagar", 300, 200);

            // Add accounts to bank
            bank.addAccount(savings);
            bank.addAccount(checking);

            // Display accounts
            bank.showAllAccounts();

            // Transactions
            savings.deposit(200);
            savings.withdraw(300);
            checking.withdraw(400); // Uses overdraft

            // Transfer Money
            savings.transfer(checking, 100);

            // Show updated details
            bank.showAllAccounts();

        } catch (TransactionException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
