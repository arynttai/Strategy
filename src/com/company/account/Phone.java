package com.company.account;

import com.company.strategy.PinPassword;

public class Phone extends Account {
    public Phone() {
        super(new PinPassword());
    }
}
