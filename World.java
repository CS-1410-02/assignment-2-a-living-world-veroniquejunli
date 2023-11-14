package com.example.test;

import java.util.ArrayList;

public class World {

    ArrayList<Critter> Creatures = new ArrayList<>();
    public static void main(String[] args){
        Creatures.add(new Critter());
        while(true){
            for(Critter c: Creatures){
                if(c.die()){
                    --Critter;
                }
                if(c.reproduce()){
                    ++Critter;
                }

    }
}
