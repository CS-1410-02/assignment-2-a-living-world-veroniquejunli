package com.example.project;
import com.example.project.Creature;

public class Critter implements Creature{

    private String name;

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
