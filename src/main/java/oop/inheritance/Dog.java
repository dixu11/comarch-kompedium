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


    public void bark() {
        System.out.println("Pies szczeka: hau! hau!");
    }

    public void aport() {
        System.out.println("Pies leci aportować");
    }
}
