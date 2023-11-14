package com.example.project;

public interface Creature implements Reproduction, Death {
    private String name;
    public Creature(String n){
        name = n;
        System.out.println("");
        
    }

    @Override
    public void reproduce(){
        System.out.println(name + " now has a child!");

    }

    @Override
    public void die(){
        System.out.println(name + " has died.");
    }
}
