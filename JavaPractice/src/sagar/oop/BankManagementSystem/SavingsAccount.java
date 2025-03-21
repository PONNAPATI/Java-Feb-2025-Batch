package oop.BankManagementSystem;

import jdk.dynalink.beans.StaticClass;

/**
 * Represents a Savings Account with withdrawal limits.
 */

public class SavingsAccount extends Account {
    private static final double MIN_BALANCE = 100.00;

    public SavingsAccount(String accountNumber, String accountHolder, double initialBalance) {
        super(accountNumber, accountHolder, initialBalance);
    }
    @Override
    public void withdraw(double amount) throws TransactionException {
        if (balance - amount < MIN_BALANCE) {
            throw new TransactionException( "Insufficient balance! Minimum balance should be $\" + MIN_BALANCE");
        }
        balance -= amount;
        System.out.println("Withdrawal of $" + amount + "successful.");
    }
}
