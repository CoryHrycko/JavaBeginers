package com.example.java;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double power = Math.pow(5,3);
        System.out.println(power);

        double sR = Math.sqrt(64);
        System.out.println(sR);


        Random rand = new Random();
        int random=rand.nextInt();
        int ranomNumberWithBounds = rand.nextInt(10);
        System.out.println(random);
        System.out.println(ranomNumberWithBounds);
    }
}
