package com.example.java;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class BPTrend {

    ArrayList<WeatherEntry> collectedData = new ArrayList<WeatherEntry>();


    public void readData(String fileName) {
        DateFormat format =new SimpleDateFormat("yyyy_MM_dd HH:mm:ss");
        try {
            BufferedReader buf = new BufferedReader(new FileReader(fileName));
            String line =null;
            String[] wordsArray;
            boolean skipFirstLine = true;

            while (true) {
                line = buf.readLine();
                if (skipFirstLine) {
                    //skip data header
                    skipFirstLine = false;
                    continue;
                }
                if (line == null) {
                    break;
                } else {
                    wordsArray = line.split("\t");
                    WeatherEntry entry = new WeatherEntry();
                    entry.pressure = Float.valueOf(wordsArray[2]);
                    entry.humidity = Float.valueOf(wordsArray[4]);
                    entry.when  = format.parse(wordsArray[0]);
                    collectedData.add(entry);
                }
                }
            buf.close();
            }catch (IOException | ParseException e) {
                e.printStackTrace();
            }
        }
        public String doCalc(String from, String to){
            DateFormat format = new SimpleDateFormat();
            Date d1 = null;
            Date d2 = null;
            try {
                d1 = format.parse(from);
                d2 = format.parse(to);
            } catch (Exception e) {
                System.out.println(e);
            }
            String result = "from"
                    + format.format(d1) + " to "
                    + format.format(d2)+ "\n";

            WeatherEntry y1 = null;
            WeatherEntry y2 = null;
            int idx =0,x1=0,x2=0;

            for (WeatherEntry x: collectedData) {
                if ((y1 == null) && x.when.compareTo(d1) >= 0) {
                    y1 = idx;
                    y2 = x;
                    break;
                }
                idx++;
            }

            //formula

            float slope= (y2.pressure - y1.pressure)/(x2 -x1);


            result = result + "The Pressure" +String.format("%.6f",slope);

            if(slope<0)result = result + "rain";
            if(slope ==0)result = result +"now is now";
            if(slope>0)result = result +"more shine";

            return result;
        };

}
