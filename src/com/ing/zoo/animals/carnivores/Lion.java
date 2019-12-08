package com.ing.zoo.animals.carnivores;

import com.ing.zoo.animals.Carnivore;

public class Lion extends Carnivore {
    private final String helloText = "roooaoaaaaar";
    private final String eatText = "nomnomnom thx mate";

    public Lion(String name) {
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
