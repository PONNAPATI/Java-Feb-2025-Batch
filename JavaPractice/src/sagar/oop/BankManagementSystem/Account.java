package oop.BankManagementSystem;

/**
 * Abstract class representing a bank account.
 */
public abstract class Account {
    protected String accountNumber;
    protected String accountHolder;
    protected double balance;

    public Account(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    // Abstract method for withdrawal, to be implemented in subclasses
    public abstract void withdraw(double amount) throws TransactionException;

    // Deposit method (common for all account types)
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + "deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    // Transfer money between accounts
    public void transfer(Account target, double amount) throws TransactionException {
        if (amount < 0) {
            throw new TransactionException("Invalid transfer amount.");
        }
        this.withdraw(amount);
        target.deposit(amount);
        System.out.println("Transferred " + amount + " to " + target.accountHolder);
    }
    // Display account details
    public void displayAccountInfo() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $ " + balance);
    }
}
