package com.company.account;

import com.company.strategy.WordPassword;

public class Wifi extends Account {
    public Wifi() {
        super(new WordPassword());
    }
}
