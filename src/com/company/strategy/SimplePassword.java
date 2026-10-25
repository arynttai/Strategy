package com.company.strategy;

import com.company.util.RandomText;

public class SimplePassword implements PasswordStrategy {
    private static final int LENGTH = 10;
    private static final String LETTERS_AND_DIGITS =
            RandomText.LOWERCASE + RandomText.UPPERCASE + RandomText.DIGITS;

    @Override
    public String generate() {
        return RandomText.randomString(LETTERS_AND_DIGITS, LENGTH);
    }
}
