package oop.inheritance;

public class Dog extends Animal { //pies JEST zwierzęciem
    private String name;
    private int age;
    private String breed;

    public Dog(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public Dog() {
        name = "Bruno";
        age = 8;
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
}
