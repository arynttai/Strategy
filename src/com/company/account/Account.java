package com.company.account;

import com.company.strategy.PasswordStrategy;

public class Account {
    private PasswordStrategy strategy;

    public Account(PasswordStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(PasswordStrategy strategy) {
        this.strategy = strategy;
    }

    public String createPassword() {
        return strategy.generate();
    }
}
