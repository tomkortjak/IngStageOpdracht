package com.ing.zoo.models.omnivore;

import com.ing.zoo.models.Omnivore;

import java.util.Random;

public class Pig extends Omnivore {
    private final String helloText = "splash";
    private final String eatText = "munch munch oink";

    public Pig(String name) {
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

    @Override
    public void eatMeat() {
        System.out.println(eatText);
    }

    @Override
    public void performTrick() {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if (rnd == 0) {
            System.out.println("rolls in the mud");
        } else {
            System.out.println("runs in circles");
        }
    }
}
