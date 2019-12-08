package com.ing.zoo.animals;

public abstract class Animal {
    private String name;

    Animal(String name) {
        this.name = name;
    }

    public abstract void sayHello();

    public void performTrick(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
