package oop.BankManagementSystem;

import java.util.ArrayList;
import java.util.List;

/**
 * Manages multiple bank accounts.
 */

public class Bank {
    private List<Account> accounts;

    public Bank(){
        this.accounts = new ArrayList<>();
    }
    public void addAccount(Account account) {
        accounts.add(account);
    }
    public void showAllAccounts() {
        for (Account acc : accounts) {
            acc.displayAccountInfo();
            System.out.println("------------------");
        }
    }
}
