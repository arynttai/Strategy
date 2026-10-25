package com.company.strategy;

import com.company.util.RandomText;

public class StrongPassword implements PasswordStrategy {
    private static final int LENGTH = 12;
    private static final String ALL_SYMBOLS =
            RandomText.LOWERCASE + RandomText.UPPERCASE + RandomText.DIGITS + RandomText.SPECIAL;

    @Override
    public String generate() {
        String required = oneOfEachType();
        String rest = RandomText.randomString(ALL_SYMBOLS, LENGTH - required.length());
        return required + rest;
    }

    private String oneOfEachType() {
        return "" + RandomText.randomChar(RandomText.LOWERCASE)
                + RandomText.randomChar(RandomText.UPPERCASE)
                + RandomText.randomChar(RandomText.DIGITS)
                + RandomText.randomChar(RandomText.SPECIAL);
    }
}
