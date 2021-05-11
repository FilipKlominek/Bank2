package com.company;

import java.util.ArrayList;

public class Bank {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    private int code;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }


    public Account createAccount(Person owner, int number, ArrayList listOfAccountNumbers) {
        if (!listOfAccountNumbers.contains(number)) {
            Account account = new Account();
            account.setBank(this.name);
            account.setOwner(owner.getName());
            account.setNumber(number);
            return account;
        }
        return null;
    }

    public void deleteAccount(Account account) {
        account = null;
    }


    public void transfer(Account sending, Account receiving, int amount) {
        if (sending.getBalance() >= amount) {
            sending.withdraw(amount);
            receiving.add(amount);
        }
    }
}
