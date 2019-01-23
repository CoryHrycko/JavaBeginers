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

        HealthBurger healthBurger = new HealthBurger("reak",5.45);
        healthBurger.itemizeHamberger();
        healthBurger.addHambergerAddition1("Egg",1.00);
        healthBurger.itemizeHamberger();
        healthBurger.addHealthAddition1("lentils",5.00);
        System.out.println("Total health slop is " +healthBurger.itemizeHamberger());
        DeluxeBurger db = new DeluxeBurger();
        db.itemizeHamberger();
    }
}
