package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("while loop");
        int x=3;
        while (x > 0) {
            System.out.println("Current x: "+x);
            x=x-1;
        }
        System.out.println("Final x:"+x);
        System.out.println();



        System.out.println("Do-while loop");
        int y=3;
        do{
            System.out.println("Current y: "+y);
            y=y-1;
        } while (y > 0);

        System.out.println("Final y:"+y);
        System.out.println();


        System.out.println("for");

        for (int i = 3; i > 0; i--) {
            System.out.println("Current y: "+i);
        }
        System.out.println();












    }
}
