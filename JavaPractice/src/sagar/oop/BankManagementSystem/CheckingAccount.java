package oop.BankManagementSystem;

public class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount(String accountNumber, String accountHolder, double initialBalance, double overdraftLimit) {
        super(accountNumber, accountHolder, initialBalance);
        this.overdraftLimit = overdraftLimit;
    }
    @Override
    public void withdraw(double amount) throws TransactionException {
        if (balance + overdraftLimit < amount) {
            throw new TransactionException("Withdrawal failed! Exceeds overdraft limit.");
        }
        balance -= amount;
        System.out.println("Withdrawal of $" + amount + "Successful.");
    }
}
