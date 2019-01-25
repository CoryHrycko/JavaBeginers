package com.example.java;

import java.util.Scanner;

public class Main {

    private static Scanner s =new Scanner(System.in);
    private static int[] baseData= new int[10];

    public static void main(String[] args) {
	// write your code here

        System.out.println("enter 10: ");
        getInput();
        printArray(baseData);
        System.out.println("enter 12 ints ");
        getInput();
        printArray(baseData);
    }
// GRABS INPUT FROM CONSOLE
    private static void getInput() {
        for (int i = 0; i < baseData.length; i++) {
            baseData[i] = s.nextInt();
        }
    }
//prints
    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(" ");
            System.out.println();
        }
    }
//reszes
    private static void resizeArray() {
        int[] orignal = baseData;

        baseData = new int[12];
        for (int i = 0; i < orignal.length; i++) {
            baseData[i] = orignal[i];
        }
    }
}
