package com.example.java;

public class Animal {
    private int brain;
    private int body;
    private int size;
    private int weight;

    public Animal(int brain, int body, int size, int weight) {
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    public void move(int speed) {
        System.out.println("Animal is MOVING at "+ speed+" !");
    }

    public void eat() {
        System.out.println("CHOMP CHOMP CHOMP");
    }

    public void move() {

    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }
}
