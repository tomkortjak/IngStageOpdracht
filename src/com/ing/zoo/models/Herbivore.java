package com.ing.zoo.models;


public abstract class Herbivore extends Animal{

    public Herbivore(String name) {
        super(name);
    }

    public abstract void eatLeaves();
}
