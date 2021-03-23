package no.hiof.larseknu;

public class BankAccount {
    private String accountNumber;
    private int balance;

    public BankAccount(String accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public synchronized int getBalance() {
        return balance;
    }

    public synchronized void insert(int amount) {
        balance += amount;
    }
}
