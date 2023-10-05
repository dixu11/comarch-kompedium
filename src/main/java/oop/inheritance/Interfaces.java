package oop.inheritance;

import oop.inheritance.animals.Dog;
import oop.inheritance.animals.Elephant;
import oop.inheritance.animals.Rat;

public class Interfaces {

    public static void main(String[] args) {


        Dog dog = new Dog();
        Rat rat = new Rat();
        Elephant elephant = new Elephant("Polo", 40);

        AnimalKeeper animalKeeper = new AnimalKeeper();


        FriendlyAnimal[] friendlyAnimals = {dog, rat}; // new wejdzie Elephant
        WildAnimal[] wildAnimals = {rat, elephant}; // nie wejdzie Dog

        for (FriendlyAnimal friendlyAnimal : friendlyAnimals) {
            friendlyAnimal.pet();
        }

        for (WildAnimal wildAnimal : wildAnimals) {
            wildAnimal.bite();
        }


    }
}
