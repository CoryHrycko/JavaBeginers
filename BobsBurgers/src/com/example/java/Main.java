package com.example.java;

/**
 *
 */


public class Main {

    public static void main(String[] args) {


        Burger hamburger =new Burger("basic", "wheat","Bacon", 5.98);
        double price = hamburger.itemizeHamberger();
        hamburger.addHambergerAddition1("Tomatoe", 0.27);
        hamburger.addHambergerAddition2("lettuce", 0.75);
        hamburger.addHambergerAddition3("cheese", 1.12);
        System.out.println(" Total Burger Price "+ hamburger.itemizeHamberger());
    }
}
