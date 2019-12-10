package com.ing.zoo.models.herbivores;

import com.ing.zoo.models.Herbivore;

public class Hippo extends Herbivore {
    private final String helloText = "splash";
    private final String eatText = "munch munch lovely";

    public Hippo(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println(helloText);
    }

    @Override
    public void eatLeaves() {
        System.out.println(eatText);
    }
}
