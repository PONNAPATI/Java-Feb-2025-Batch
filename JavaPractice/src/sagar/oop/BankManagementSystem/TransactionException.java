package oop.BankManagementSystem;

/**
 * Custom exception for handling transaction errors.
 */
public class TransactionException extends Exception {
    public TransactionException(String message) {
        super(message);
    }
}