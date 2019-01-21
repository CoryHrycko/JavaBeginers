package com.example.java;

public class BankAccount {
    private int accountNumber;
    private int accounBalance;

    public BankAccount(int accountNumber, int accounBalance) {
        this.accountNumber=accountNumber;
        this.accounBalance=accounBalance;
        System.out.println("You created account "+
                this.accountNumber);
    }

    public void deposit(int addMoney) {
        if (addMoney < 0) {
            System.out.println("you canot desposit a "+
                    "negative amount.");
        }else{
            this.accounBalance=this.accounBalance + addMoney;
            System.out.println("$"+addMoney+
                    " deposited into account: "+accountNumber+".");
        }
    }

    public void withdraw(int removeMoney) {
        if (removeMoney > this.accounBalance) {
            System.out.println("No no no, Can't remove more than" +
                    "what is in there!");
        } else {
            this.accounBalance=this.accounBalance - removeMoney;
            System.out.println("$"+removeMoney+" has been withdrawn from account "+
                    this.accountNumber+".");
        }
    }
















}
