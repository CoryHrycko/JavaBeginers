package com.example.java;

public class Fish extends Animal {
    private int fins;
    private int eyes;
    private int scales;
    private int mouth;

    public Fish( int size, int weight, int eyes, int fins, int scales, int mouth) {
        super(1, 1, size, weight);
        this.eyes = eyes;
        this.fins = fins;
        this.scales =scales;
        this.mouth = mouth;
    }
    private void swim() {
        System.out.println("my god that fish can swim");
        move(17);
    }

    private void swim(int speed) {
        System.out.println("Dang fish");
        swim();
    }

    public void inhaleFood() {
        System.out.println("That fish just swalled that whole!");
        eat();
    }

    @Override
    public void move(int speed) {
        swim(speed);
        super.move(speed);
    }
}
