package oop.inheritance.animals;

public class Rat extends Animal {
    private String color;

    public Rat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    public Rat() {
        super("Szczurek",3);
        color = "brązowy";
    }

    public void squick() {
        System.out.println("Piii pii!");
    }

    @Override
    public void makeSound() {
        squick();
    }

    public void run(){
        System.out.println("Biega w kołowrotku");
    }

    public void eat() {
        super.eat();
        System.out.println("Dobiera się do sera");
    }
}
