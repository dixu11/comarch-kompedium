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

        rat.squick();
        rat.run();

        //Dzidziczymy:
        //metody
        //pola
        //typ?
        //konstruktory - nie

    }
}
