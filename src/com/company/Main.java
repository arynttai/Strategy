package com.company;

import com.company.strategy.PasswordStrategy;
import com.company.strategy.PinPassword;
import com.company.strategy.SimplePassword;
import com.company.strategy.StrongPassword;
import com.company.strategy.WordPassword;

public class Main {
    public static void main(String[] args) {
        PasswordStrategy pin = new PinPassword();
        PasswordStrategy simple = new SimplePassword();
        PasswordStrategy strong = new StrongPassword();
        PasswordStrategy word = new WordPassword();

        System.out.println("PIN password:    " + pin.generate());
        System.out.println("Simple password: " + simple.generate());
        System.out.println("Strong password: " + strong.generate());
        System.out.println("Word password:   " + word.generate());
    }
}
