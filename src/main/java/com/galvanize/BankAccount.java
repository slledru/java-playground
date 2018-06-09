package com.galvanize;

class BankAccount {
    private String name;
    private long balance;

    public BankAccount() {
        this("", 0);
    }

    public BankAccount(String name, long balance) {
        this.name = name;
        this.balance = balance;
    }

    public void deposit(long cents) {
        this.balance += cents;
    }

    public void withdraw(long cents) {
        this.balance -= cents;
    }

    public long balance() {
        return balance;
    }

    public boolean isOverDrawn() {
        return (this.balance < 0);
    }

    private int bar = 0;
    private void foo(int input) {
        this.bar += input;
    }
    public int bar() {
        return this.bar * 20;
    }
}
