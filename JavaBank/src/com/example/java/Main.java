package com.example.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BankAccount myBankAccount = new BankAccount(9302,100);
//        this will throw protections
//        System.out.println(myBankAccount.bankAccoun;);
//        this will also throw protections
        myBankAccount.deposit(-60);
        myBankAccount.withdraw(150);


//        this will be normal
        myBankAccount.deposit(100);
        myBankAccount.withdraw(200);

    }
}