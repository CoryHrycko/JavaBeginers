package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
    Animal animal = new Animal(1,1,1,1);//main class

    Dog dog = new Dog(1,1,1,1,1,1);//sub class
        dog.eat();
        dog.walk();
        dog.run();
        System.out.println("\n");
    Fish flounder = new Fish(1,12,2,2,400,1);
        flounder.move(18);
        flounder.inhaleFood();

}
}
