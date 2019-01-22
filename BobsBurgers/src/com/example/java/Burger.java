package com.example.java;

public class Burger {
//    Variables,
    private String name;
    private String roll;
    private String meat;
    private double price;

    private String addition1name;
    private double addition1Price;

    private String addition2name;
    private double addition2Price;

    private String addition3name;
    private double addition3Price;

    private String addition4name;
    private double addition4Price;

    public Burger(String name, String roll, String meat, double price) {
        this.name = name;
        this.roll = roll;
        this.meat = meat;
        this.price = price;
    }

    public void addHambergerAddition1(String name, double price){
        this.addition1name = name;
        this.addition1Price = price;
    }
    public void addHambergerAddition2(String name, double price){
        this.addition2name = name;
        this.addition2Price = price;
    }
    public void addHambergerAddition3(String name, double price){
        this.addition3name = name;
        this.addition3Price = price;
    }
    public void addHambergerAddition4(String name, double price){
        this.addition4name = name;
        this.addition4Price = price;
    }
    public double itemizeHamberger(){
        double hamburgerPrice = this.price;
        System.out.println(this.name + " hamburger " + "on a "+this.roll+" roll with "+ this.meat+" meat and the " + "price is "+ this.price);
        if (this.addition1name !=null){
            hamburgerPrice +=this.addition1Price;
            System.out.println("added " + this.addition1name + " for an extra "+this.addition1Price);

        }
        if (this.addition2name !=null){
            hamburgerPrice +=this.addition2Price;
            System.out.println("added " + this.addition2name + " for an extra "+this.addition2Price);

        }
        if (this.addition3name !=null){
            hamburgerPrice +=this.addition3Price;
            System.out.println("added " + this.addition3name + " for an extra "+this.addition3Price);

        }
        if (this.addition4name !=null){
            hamburgerPrice +=this.addition4Price;
            System.out.println("added " + this.addition4name + " for an extra "+this.addition4Price);

        }

        return hamburgerPrice;
    }











}
