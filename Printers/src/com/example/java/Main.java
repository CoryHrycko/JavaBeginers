package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
    Printer printTask = new Printer(200,20, true);
    System.out.println(printTask.getInkLevels()+" "+printTask.getPages()+" "+printTask.isDuplexPrinter());
    printTask.setInkLevels(200);
    System.out.println(printTask.getInkLevels());
    System.out.println(printTask.isDuplexPrinter());

    }
}
