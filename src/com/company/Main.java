package com.company;

import com.company.account.Account;
import com.company.account.Bank;
import com.company.account.Game;
import com.company.account.Phone;
import com.company.account.Wifi;
import com.company.strategy.StrongPassword;
import com.company.strategy.WordPassword;

public class Main {
    public static void main(String[] args) {
        Account phone = new Phone();
        Account game = new Game();
        Account bank = new Bank();
        Account wifi = new Wifi();

        System.out.println("Phone: " + phone.createPassword());
        System.out.println("Game:  " + game.createPassword());
        System.out.println("Bank:  " + bank.createPassword());
        System.out.println("Wifi:  " + wifi.createPassword());

        System.out.println();
        System.out.println("Changing strategy at runtime:");

        wifi.setStrategy(new StrongPassword());
        System.out.println("Wifi:  " + wifi.createPassword());

        phone.setStrategy(new WordPassword());
        System.out.println("Phone: " + phone.createPassword());
    }
}
