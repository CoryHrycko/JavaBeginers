package com.example.java;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
	// write your code here
//        int[] myVar;
//        myVar =new int[30];
//        int[] myVar2 = new int[10];
//        myVar[5] = 50;
////        start at position 0
//        double[] myDobArray =new double[10];
//        System.out.println(myVar[5]);
//
//        int[] myVar3 = {1,2,3,4,5,6,7,8,9,10};
//        System.out.println(myVar3[4]);
//        System.out.println(myVar3[7]);
//        System.out.println(myVar3[9]);
//        System.out.println("\n");
//        for (int i = 0; i < 10; i++) {
//            myVar3[i]=i*10;
//        }
//        for (int i = 0; i < 10; i++) {
//            System.out.println("Element "+i+", value "+myVar3);
//        }
//        for (int i = 0; i < myVar.length; i++) {
//            System.out.println("Element "+i+", value "+myVar);
//        }
        int[] MyInts = getIntegers(5);
        for (int i = 0; i < MyInts.length; i++) {
            System.out.println("Element "+i+" typed value was "+
                    MyInts[i]);
        }
        System.out.println("Avereages: "+getAve(MyInts));
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter "+number  +" integer values. \r");
        int[] values =new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }
    public static double getAve(int[] array) {
        int sum = 0;
        for (int i=0; i<array.length;i++) {
            sum += array[i];
        }
        return (double) sum / (double)array.length;
    }
}
