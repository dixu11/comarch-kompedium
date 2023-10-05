package oop.inheritance.animals;

import oop.inheritance.FriendlyAnimal;

public class Dog extends Animal implements FriendlyAnimal { //pies JEST zwierzęciem
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name,age);
        this.breed = breed;
    }

    public Dog() {
        super("Bruno",8);
        breed = "mieszaniec";
    }

    @Override
    public void eat() {
        System.out.println("Pies je kość!");
    }

    public void bark() {
        System.out.println("Pies szczeka: hau! hau!");
    }

    @Override
    public void makeSound() {
        bark();
    }

    public void aport() {
        System.out.println("Pies leci aportować");
    }

    @Override
    public void pet() {
        System.out.println("Pies macha ogonem z radości!");
    }
}
