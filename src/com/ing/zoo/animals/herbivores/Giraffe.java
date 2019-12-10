package com.ing.zoo.animals.herbivores;

import com.ing.zoo.animals.Herbivore;

import java.util.Random;

public class Giraffe extends Herbivore {
    private final String helloText = "swoosh";
    private final String eatText = "nomnom";

    public Giraffe(String name) {
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
    public void performTrick() {
        Random random = new Random();

        int rnd = random.nextInt(2);
        if(rnd == 0) {
            System.out.println("swings neck");
        }
        else {
            System.out.println("bounces head");
        }
    }
}
