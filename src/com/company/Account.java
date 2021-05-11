package com.company;

public class Account {

    private String owner;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }


    private String bank;

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }


    private int balance;

    public int getBalance() {
        return balance;
    }


    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }


    public void add(int amount) {
        this.balance += amount;
    }


    public void withdraw(int amount) {
        this.balance -= amount;
    }
}
