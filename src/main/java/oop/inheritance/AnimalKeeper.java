package oop.inheritance;

import oop.inheritance.animals.Animal;
import oop.inheritance.animals.Dog;
import oop.inheritance.animals.Rat;

public class AnimalKeeper {
    public void feedDog(Dog dog) {
        System.out.println("Zaopiekuję się psem!");
        dog.eat();
        dog.bark();
    }

    public void feedRat(Rat rat) {
        System.out.println("Zaopiekuję się szczurem!");
        rat.eat();
        rat.squick();
    }

    public void feedAnimal(Animal animal) {
        System.out.println("Zaopiekuję się zwierzęciem!");
        animal.eat();
        if (animal.getClass().equals(Dog.class)) {
            System.out.println("To pies!");
            Dog dog = (Dog) animal;
            dog.bark();
        } else if (animal.getClass().equals(Rat.class)) {
            System.out.println("To szczur!");
            Rat rat = (Rat) animal;
            rat.squick();
        }
    }

    public void feedAnimal2(Animal animal) { // instanceof version
        System.out.println("Zaopiekuję się zwierzęciem!");
        animal.eat();
        if (animal instanceof  Dog) {
            System.out.println("To pies!");
            Dog dog = (Dog) animal;
            dog.bark();
        } else if (animal instanceof Rat) {
            System.out.println("To szczur!");
            Rat rat = (Rat) animal;
            rat.squick();
        }
    }

    public void feedAnimal3(Animal animal) { // polymorphism version
        System.out.println("Zaopiekuję się zwierzęciem!");
        animal.eat();
        animal.makeSound();
    }
}
