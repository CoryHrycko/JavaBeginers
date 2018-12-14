package com.example.java;

import java.awt.*;

public class Main {
    public class House {
        boolean rentEFalse;
        Color houseColor;
        String amountOfRooms;
        String amountOfBathRooms;
        boolean pool;

    public House(boolean inputRentEFalse,
                 Color inputHouseColor,
                 String inputAmountOfRooms,
                 String inputAmountofBathRooms,
                 boolean inputPool) {
        this.rentEFalse        = inputRentEFalse;
        this.houseColor        = inputHouseColor;
        this.amountOfRooms     = inputAmountOfRooms;
        this.amountOfBathRooms = inputAmountofBathRooms;
        this.pool              = inputPool;
    };
}

   House myHouse = new House(
                   true,
                                Color.pink,
              "4",
           "4",
                       true);

};
