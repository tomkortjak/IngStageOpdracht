package com.ing.zoo;

import com.ing.zoo.animals.Animal;
import com.ing.zoo.animals.Carnivore;
import com.ing.zoo.animals.Herbivore;
import com.ing.zoo.animals.carnivores.Lion;
import com.ing.zoo.animals.carnivores.Tiger;
import com.ing.zoo.animals.herbivores.Hippo;
import com.ing.zoo.animals.herbivores.Zebra;
import com.ing.zoo.animals.omnivore.Pig;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
        String input = "";
        //Array of commands
        String[] commands = new String[4];
        commands[0] = "hello";
        commands[1] = "give leaves";
        commands[2] = "give meat";
        commands[3] = "perform trick";

        //List of new animals
        List<Animal> animals = new ArrayList<>();
        animals.add(new Lion("henk"));
        animals.add(new Hippo("elsa"));
        animals.add(new Pig("dora"));
        animals.add(new Tiger("wally"));
        animals.add(new Zebra("marty"));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in (voer S in om te stoppen): ");

        while (!input.toLowerCase().equals("s")) {
            input = scanner.nextLine();

            if (input.contains(commands[0])) {
                for (Animal animal : animals) {
                    if (input.contains(animal.getName())) {
                        animal.sayHello();
                        break;
                    } else if (input.equals("hello")) {
                        animal.sayHello();
                    }
                }
            } else if (input.contains(commands[1])) {
                for (Animal animal : animals) {
                    if (animal instanceof Herbivore) {
                        ((Herbivore) animal).eatLeaves();
                    }
                }
            } else if (input.contains(commands[2])) {
                for (Animal animal : animals) {
                    if (animal instanceof Carnivore) {
                        ((Carnivore) animal).eatMeat();
                    }
                }
            } else if (input.contains(commands[3])) {
                for (Animal animal : animals) {
                    animal.performTrick();
                }
            } else {
                System.out.println("Unknown command: " + input);
            }
        }
    }
}

