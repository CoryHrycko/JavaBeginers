package com.example.java;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here 31, 45, 22, 98, 10

        int[] numbers = new int[5];

        numbers[0] = 31;
        numbers[1] = 45;
        numbers[2] = 22;
        numbers[3] = 98;
        numbers[4] = 10;

        int[] number2 ={31, 45, 22, 98, 10};
        Arrays.sort(number2);
        System.out.println(Arrays.toString(number2));


        String[] myFavoriteCandyBars = {
                "Twix",
                "Hershey's",
                "Crunch"};
        System.out.println("index 1: "+myFavoriteCandyBars[1]);
        myFavoriteCandyBars[2] = "butterfinger";
        System.out.println("index 1: "+myFavoriteCandyBars[2]);
        System.out.println(myFavoriteCandyBars.length);

        System.out.println( Array.get(myFavoriteCandyBars, 2));
    }
}
