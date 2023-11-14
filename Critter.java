package com.example.test;

public class Critter implements Creature{

    Random Chance = new Random();
    
    boolean die(){
        int dieChance = 10;
        return dieChance < Chance.nextInt(100);
    }
    boolean reproduce(){
        int repoChance = 70;
        return repoChance < Chance.nextInt(100);
    }
}
