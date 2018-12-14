package com.example.java;

import java.util.Random;

public class Dice {

    public final static int One = 0;
    public final static int Two = 1;
    public final static int Three = 2;
    public final static int Four = 3;
    public final static int Five = 4;
    public final static int Six= 5;

    private int faceUp;

    public Dice() {
        roll();
    }
    public void roll() {
        Random rand = new Random();
        faceUp = rand.nextInt(6);
    }
    public String getFaceUp() {
        if (faceUp == One) {
            return "1";
        }else if(faceUp == Two){
            return "2";
        }else if(faceUp == Three){
            return "3";
        }else if(faceUp == Four){
            return "4";
        }else if(faceUp == Five){
            return "5";
        }else if(faceUp == Six){
            return "6";
        }else{
            return "OOPS OUR BAD TRY AGAIN";
        }
    };



}
