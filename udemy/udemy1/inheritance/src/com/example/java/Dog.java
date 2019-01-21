package com.example.java;

public class Dog extends Animal {
    private int eyes;
    private int legs;
    private int tail;
    private int coat;


    public Dog( int size, int weight,int eyes,int legs, int tail, int coat) {
        super(1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.coat = coat;

    }

    private void chew() {
        System.out.println("chewing");
    }

    @Override
    public void eat() {
        System.out.println("dog is chewing");
        chew();
        super.eat();
    }

    public void walk() {
        System.out.println("The Dog Walked");
        move(5);
    }

    public void run() {
        System.out.println("The Dog Ran");
        move(10);

    }

    private void moveLegs(int speed) {
        System.out.println("moving those legs fast");
    }
    @Override
    public void move(int speed) {
        System.out.println("DOG MOVEEEED");
        moveLegs(speed);
        super.move(speed);
    }
}
