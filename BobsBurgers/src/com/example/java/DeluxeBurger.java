package com.example.java;

public class DeluxeBurger extends Burger{
    public DeluxeBurger() {
        super("Delux", "White", "Bacon and Meat", 6.67);
        super.addHambergerAddition1("Chips", 2.90);
        super.addHambergerAddition2("Drank",3.00);

    }

    @Override
    public void addHambergerAddition1(String name, double price) {
        System.out.println("cannot add aditional pylons");    }

    @Override
    public void addHambergerAddition2(String name, double price) {
        System.out.println("cannot add aditional pylons");
    }

    @Override
    public void addHambergerAddition3(String name, double price) {
        System.out.println("cannot add aditional pylons");    }

    @Override
    public void addHambergerAddition4(String name, double price) {
        System.out.println("cannot add aditional pylons");    }
}
