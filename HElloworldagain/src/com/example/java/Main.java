package com.example.java;

import java.awt.*;
import java.sql.SQLOutput;

public class Main {


    public static void main(String[] args) {
        // write your code here
        System.out.println("hello world");
        String kat = "Kathryn";
        System.out.println(kat);
    }

    public class Car {
        //        DATA TYPES:
//        int- > integer 1,2,3
//        double -> deicmal 34.3
//          string -> words
//          Color -> from awt lib
//          Boolean -> true fals
        double averageMPG;
        String licsPlate;
        Color paintColor;
        boolean tailLights;

        public Car(double inputAverageMPG,
                   String inputLicsPLate,
                   //    creating a class constructor
                   Color inputPaintColor,
                   boolean inputTailLights) {
            this.averageMPG = inputAverageMPG;
            this.licsPlate = inputLicsPLate;
            this.paintColor = inputPaintColor;
            this.tailLights = inputTailLights;
        }

        Car myCar = new Car(25.5,
                "HJ45w",
                Color.pink,
                true);


        Car sallyCar = new Car(12.9,
                "3KDJ0",
                Color.black,
                false);

        System.out.println("my car"+myCar.licsPlate);

    }

}
