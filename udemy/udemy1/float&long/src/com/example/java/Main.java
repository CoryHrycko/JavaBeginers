package com.example.java;

public class Main {

    public static void main(String[] args) {
	int myI = 5/2;
	float myF = 5f/2f;
	double myD = 5d/2f;
        System.out.println("int " + myI);
        System.out.println("float " + myF);
        System.out.println("double " + myD);

        double pounds = 3d;//could be a scanner to allow the user to type in any amount
        double conv=0.45359237d;
        double kilos = conv*pounds;
        System.out.println(kilos);
    }
}
