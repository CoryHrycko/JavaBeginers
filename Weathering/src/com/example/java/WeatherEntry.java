package com.example.java;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class WeatherEntry {
    // input fields
    Date when;
    float pressure;
    float humidity;

    public String toString() {
        DateFormat formate = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

        return ("Data for: " + formate.format(when)
                + "Baro Pressure: "
                + Float.toString(pressure)
                + " Humidity: "
                + Float.toString(humidity));
    }
}
