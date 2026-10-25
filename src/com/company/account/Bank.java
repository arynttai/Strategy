package com.company.account;

import com.company.strategy.StrongPassword;

public class Bank extends Account {
    public Bank() {
        super(new StrongPassword());
    }
}
