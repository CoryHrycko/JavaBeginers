package com.example.java;

public class Main {

    public static void main(String[] args) {
//	// write your code here
//        Player player = new Player();
//        player.name = "Tim";
//        player.health= 20;
//        player.weapon ="sword";
//
//        System.out.println(player.healthRemaing() + " HAHA I am at full health!");
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Ouch 10 points of dam! I have :"+player.healthRemaing());
//
//        damage=11;
//        player.loseHealth(damage);
//        System.out.println("Ouch 10 points of dam! I have :"+player.healthRemaing());
        EnhancedPlayer player = new EnhancedPlayer("Tim", 50,"sword");
        System.out.println("initial health is " + player.getHealth());
    }
}
