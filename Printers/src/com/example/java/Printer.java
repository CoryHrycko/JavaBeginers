package com.example.java;

public class Printer {
/**needs the following:
 * tonner level
 * number of pages printed
 * TODO:whether it is a duplex printer
 *---
 * needs a method to:
 * TODO: fill up the toner
 * TODO: simulate printing page with incremental nunbers
 */
//Variables
    private int inkLevels = 100;
    private int pages;
    private boolean duplexPrinter = false;
//constructor
    public Printer(int tonerLevel, int pages, boolean duplexPrinter)
    {
        if(tonerLevel>0 && tonerLevel<=100){
            this.inkLevels = tonerLevel;
        }
        this.pages = pages;
        this.duplexPrinter = duplexPrinter;
    }
//getters and setters
    public int getInkLevels() {
        return inkLevels;
    }

    public void setInkLevels(int inkLevels) {
        if(inkLevels>0 && inkLevels<=100){
            this.inkLevels = inkLevels;
        }
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;

    }

    public boolean isDuplexPrinter() {
        var duplex = 0;

        if(duplexPrinter == true){
            var duplex = System.out.println("YOU CAN PRINT ON BOTH SIDES YES!!");
        }else{
            var duplex = System.out.println("Shoot! you can't print on both sides");
        }
        return duplex;
    }

    public void setDuplexPrinter(boolean duplexPrinter) {
        this.duplexPrinter = duplexPrinter;
    }
}
