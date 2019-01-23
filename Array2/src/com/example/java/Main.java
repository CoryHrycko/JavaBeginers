package com.example.java;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static  Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here


        int[] myInts = getIntegers(5);
        int[] sorted = sortIntegers(myInts);
        printArray(sorted);
    }

    public static int[] getIntegers(int capacity) {
        int [] array = new int[capacity];
        System.out.println("Enter " + capacity+" integers value: \r");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }
    public static void printArray(int[] array) {
        for (int i=0; i<array.length;
        i++) {
            System.out.println("Element "+i+" content " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
//        int[] sortedArray=new int[array.length];
//        for (int i = 0; i < array.length; i++) {
//            sortedArray[i] = array[i];
//        }
//        BOTH OF THESE ARE THE SAME THE ONE BELOW IS BUILT IN.\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/
        int[] sortedArray = Arrays.copyOf(array,array.length);


        boolean flag = true;
        int temp;
        while (flag) {
            flag =false;
            /**
             * element 0  50
             * element 1  160
             * element 2  40
             * is 50, the position 0, less than 160, the position 1,
             * no
             * temp is taking taking the current value
             * replaceing the element with the greater value. the placing the temp in the old spot.
             */
            for (int i = 0; i < sortedArray.length-1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {

                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag =true;
                }
                }
            }
        return sortedArray;
        }



    }


















