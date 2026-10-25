package com.company.strategy;

import com.company.util.RandomText;

import java.util.StringJoiner;

public class WordPassword implements PasswordStrategy {
    private static final int WORD_COUNT = 3;
    private static final String SEPARATOR = "-";
    private static final String[] WORDS = {
            "aitu", "dog", "car", "lrt", "computer", "star",
            "rock", "guitar", "motorbike", "freedom", "hackathon", "piano"
    };

    @Override
    public String generate() {
        StringJoiner password = new StringJoiner(SEPARATOR);
        for (int i = 0; i < WORD_COUNT; i++) {
            password.add(RandomText.randomWord(WORDS));
        }
        return password.toString();
    }
}
