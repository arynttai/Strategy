package com.company.util;

import java.security.SecureRandom;

public class RandomText {
    public static final String DIGITS = "0123456789";
    public static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    public static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String SPECIAL = "!@#$%&*?";

    private static final SecureRandom RANDOM = new SecureRandom();

    private RandomText() {
    }

    public static char randomChar(String symbols) {
        return symbols.charAt(RANDOM.nextInt(symbols.length()));
    }

    public static String randomString(String symbols, int length) {
        StringBuilder text = new StringBuilder();
        for (int i = 0; i < length; i++) {
            text.append(randomChar(symbols));
        }
        return text.toString();
    }

    public static String randomWord(String[] words) {
        return words[RANDOM.nextInt(words.length)];
    }
}
