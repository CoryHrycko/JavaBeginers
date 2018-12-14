package com.example.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc= new Scanner(System.in);
        int input = sc.nextInt();
        int dsc = Integer.parseInt(String.valueOf(input));
        Dice r = new Dice();
//        System.out.println(r.getFaceUp());

//        int i;

        for (int i=dsc; 0 < i;i--) {

            System.out.println(r.getFaceUp());
        }
    }
}
