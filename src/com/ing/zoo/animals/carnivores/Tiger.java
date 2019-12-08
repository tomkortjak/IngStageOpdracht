package com.ing.zoo.animals.carnivores;

import com.ing.zoo.animals.Carnivore;

import java.util.Random;

public class Tiger extends Carnivore {
    private final String helloText = "rraaarww";
    private final String eatText = "nomnomnom oink wubalubadubdub";

    public Tiger(String name) {
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

    @Override
    public void performTrick() {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if (rnd == 0) {
            System.out.println( "jumps in tree");
        } else {
            System.out.println("scratches ears");
        }
    }
}
