package com.company;

import com.company.account.Account;
import com.company.strategy.PinPassword;
import com.company.strategy.SimplePassword;
import com.company.strategy.StrongPassword;
import com.company.strategy.WordPassword;

public class Main {
    public static void main(String[] args) {
        Account account = new Account(new PinPassword());
        System.out.println("PIN password:    " + account.createPassword());

        account.setStrategy(new SimplePassword());
        System.out.println("Simple password: " + account.createPassword());

        account.setStrategy(new StrongPassword());
        System.out.println("Strong password: " + account.createPassword());

        account.setStrategy(new WordPassword());
        System.out.println("Word password:   " + account.createPassword());
    }
}
