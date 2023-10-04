package oop.inheritance;

import java.util.Random;

public class AnimalsDemo {
    public static void main(String[] args) {
        Dog animal = new Dog();
        //  animal = new Rat(); //zadziała jeśli zmienna typu Dog
        // animal = new Random(); //zadziała jeśli typ Object

        Dog dog2 = new Dog("Luna", 9, "cavalier");

        //dziedziczymy typ!
        //możemy więc wstawić obiekt psa do zmiennej typu Animal
        //oraz wszystkie inne obiekty dziedziczące po animal
        //widzimy tylko te metody obecne na klasie Animal

        animal.eat();
        animal.bark();
        animal.aport();
        // animal.squick();
        System.out.println(animal.toString());

        Rat rat = new Rat();

        rat.eat();
        rat.squick();
        rat.run();

        //Dzidziczymy:
        //metody
        //pola
        //typ?
        //konstruktory - nie

        System.out.println("-----------------");
        AnimalKeeper animalKeeper = new AnimalKeeper();
//        animalKeeper.feedDog(dog2);
//        animalKeeper.feedRat(rat);
        animalKeeper.feedAnimal3(dog2);
        animalKeeper.feedAnimal3(rat);


        //polimorfizm, zdolność języka obiektowego
        //do tworzenia ogólnych typów zmiennych, dla wielu obiektów
        //metody będą dostosowywać swoje działanie
        System.out.println("----------");
        Animal anAnimal = new Dog();
        anAnimal.eat(); //behaves like a dog
        anAnimal = new Rat();
        anAnimal.eat(); //behaves like a rat

        System.out.println("----------");
        Animal[] animals = {dog2, anAnimal, rat};
        for (Animal nextAnimal : animals) {
            nextAnimal.makeSound();
        }
    }
}
