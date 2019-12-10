package com.ing.zoo.driver;
import com.ing.zoo.models.Animal;
import com.ing.zoo.models.Carnivore;
import com.ing.zoo.models.Herbivore;
import com.ing.zoo.models.carnivores.Bear;
import com.ing.zoo.models.carnivores.Lion;
import com.ing.zoo.models.carnivores.Tiger;
import com.ing.zoo.models.herbivores.Giraffe;
import com.ing.zoo.models.herbivores.Hippo;
import com.ing.zoo.models.herbivores.Zebra;
import com.ing.zoo.models.omnivore.Pig;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * author: Tom Kwarten
 * Description: This application imitates a Zoo with different types of animals: Herbivore, Carnivore and Omnivore
 * There are 4 commands which activate a method from the animals that belong to that command.
 */
public class Zoo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        //Array of commands
        String[] commands = new String[4];
        commands[0] = "hello";
        commands[1] = "give leaves";
        commands[2] = "give meat";
        commands[3] = "perform trick";

        //ArrayList of with 7 instances of animals
        List<Animal> animals = new ArrayList<>();
        animals.add(new Lion("henk"));
        animals.add(new Hippo("elsa"));
        animals.add(new Pig("dora"));
        animals.add(new Tiger("wally"));
        animals.add(new Zebra("marty"));
        animals.add(new Giraffe("neckie"));
        animals.add(new Bear("winnie"));

        //Print out all animals
        System.out.println("All animals:");
        animals.forEach(animal -> System.out.println("Name: " + animal.getName() + " - Type: " + animal.getClass().getSimpleName()));

        //print commands
        System.out.println("\nAll commands:");
        Arrays.stream(commands).forEach(System.out::println);

        //Checks every input and searching for a command according to the input
        while (!input.toLowerCase().equals("s")) {
            System.out.print("\nType in your command (type S to stop the application): ");
            input = scanner.nextLine();
            String temporaryInput = input;
            Animal foundAnimal = animals.stream()
                    .filter(animal -> ("hello " + animal.getName()).equals(temporaryInput)).findFirst().orElse(null);

            if (foundAnimal == null && input.equals(commands[0])) {
                animals.forEach(Animal::sayHello);
            } else if (foundAnimal != null && input.contains(commands[0])) {
                foundAnimal.sayHello();
            } else if (input.equals(commands[1])) {
                animals.stream().filter(animal -> animal instanceof Herbivore).forEach(animal -> ((Herbivore) animal).eatLeaves());
            } else if (input.equals(commands[2])) {
                animals.stream().filter(animal -> animal instanceof Carnivore).forEach(animal -> ((Carnivore) animal).eatMeat());
            } else if (input.equals(commands[3])) {
                animals.forEach(Animal::performTrick);
            } else {
                System.out.println("Unknown command: " + input);
            }
        }
    }
}

