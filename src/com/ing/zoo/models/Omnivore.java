package com.ing.zoo.models;

public abstract class Omnivore extends Animal{

    public Omnivore(String name){
        super(name);
    }

    public abstract void eatLeaves();

    public abstract void eatMeat();

}
