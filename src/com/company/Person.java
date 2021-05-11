package com.company;

import java.util.ArrayList;

public class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }


    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    private int funds;

    public int getFunds() {
        return funds;
    }

    public void setFunds(int funds) {
        this.funds = funds;
    }


    public Account createAccount(Bank bank, int number, ArrayList listOfAccountNumbers) {
        if (!listOfAccountNumbers.contains(number)) {
            Account account = new Account();
            account.setBank(bank.getName());
            account.setOwner(this.name);
            account.setNumber(number);
            return account;
        }
        return null;
    }

    public void deleteAccount(Account account) {
        account = null;
    }


    public void addToAccount(Account account, int amount) {
        if (this.funds >= amount) {
            this.funds -= amount;
            account.add(amount);
        }
    }

    public void withdraw(Account account, int amount) {
        if (account.getBalance() >= amount) {
            this.funds += amount;
            account.withdraw(amount);
        }
    }
}
