package com.example.java;

public class HealthBurger extends Burger {
    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthBurger( String meat, double price) {
        super("Healthy", "Brown rye",meat, price);
    }
    public void addHealthAddition1(String name, double price){
        this.healthyExtra1Name = name;
        this.healthyExtra1Price =price;
    }
    public void addHealthAddition2(String name, double price){
        this.healthyExtra2Name = name;
        this.healthyExtra2Price =price;
    }

    @Override
    public double itemizeHamberger() {
        double burgerPrice= super.itemizeHamberger();
        if (this.healthyExtra1Name != null) {
            burgerPrice += this.healthyExtra1Price;
            System.out.println("added "+ this.healthyExtra1Name+ " for an extra "+ this.healthyExtra1Price);
        }
        if (this.healthyExtra2Name != null) {
            burgerPrice += this.healthyExtra2Price;
            System.out.println("added "+ this.healthyExtra2Name+ " for an extra "+ this.healthyExtra2Price);
        }
        return burgerPrice;

    }
}
