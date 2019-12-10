package com.ing.zoo.models.carnivores;

import com.ing.zoo.models.Carnivore;

public class Bear extends Carnivore {
    private final String helloText = "rawr";
    private final String eatText = "nomnomnom";

    public Bear(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println(helloText);
    }

    @Override
    public void eatMeat() {
        System.out.println(eatText);
    }

}
