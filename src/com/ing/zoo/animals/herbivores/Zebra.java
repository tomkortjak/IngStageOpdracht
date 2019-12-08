package com.ing.zoo.animals.herbivores;

import com.ing.zoo.animals.Herbivore;

import java.util.Random;

public class Zebra extends Herbivore {
    private final String helloText = "zebra zebra";
    private final String eatText = "munch munch zank yee bra";

    public Zebra(String name) {
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
            System.out.println("plays with ball");
        }
        else {
            System.out.println("runs around");
        }

    }
}
