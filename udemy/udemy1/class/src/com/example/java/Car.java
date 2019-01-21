package com.example.java;

import java.awt.*;

public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private Color color;

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("porsche") || validModel.equals("holden")) {
            this.model = model;
        } else {
            this.model="unknown";
        }
        this.model= model;
    }

    public String getModel() {
        return this.model;
    }

}
