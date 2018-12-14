package com.example.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        StringBuilder sb = new StringBuilder("welcome");
//        sb.append(" to Cali");
//        sb.toString();
//        String result = sb.toString();
//        System.out.println(result);
        System.out.println("Enter Value 1:");

        StringBuilder b = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine();

        System.out.println("Enter Value 2:");
        String input2 = scanner.nextLine();

        b.append(input1)
                .append(", ")
                .append(input2);

        System.out.println(b.toString());
    }
}
