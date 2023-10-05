package oop.inheritance.animals;

import oop.inheritance.WildAnimal;

public class Elephant extends Animal implements WildAnimal {


    public Elephant(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Słoń trombi trąbą");
    }

    @Override
    public void bite() {
        System.out.println("Gryzie ale kiepsko mu to idzie");
    }
}
