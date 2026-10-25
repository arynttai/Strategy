package com.company.account;

import com.company.strategy.SimplePassword;

public class Game extends Account {
    public Game() {
        super(new SimplePassword());
    }
}
