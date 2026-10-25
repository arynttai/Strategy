package com.company.strategy;

import com.company.util.RandomText;

public class PinPassword implements PasswordStrategy {
    private static final int LENGTH = 4;

    @Override
    public String generate() {
        return RandomText.randomString(RandomText.DIGITS, LENGTH);
    }
}
