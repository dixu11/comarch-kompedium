package oop.inheritance;

public abstract class Animal {
    //abstrakcyjna klasa może mieć abstrakcyjne metody
    //nie można zrobić obiektu bezpośrednio z typu Animal

    public void eat() {
        System.out.println("Zwierze sobie je");
    }

    public abstract void makeSound();
    //abstrakcyjna metoda nie ma ciała
}
