package oop.inheritance.animals;

public abstract class Animal {
    //abstrakcyjna klasa może mieć abstrakcyjne metody
    //nie można zrobić obiektu bezpośrednio z typu Animal

     String name;  //ew. protected - dla klas dzidziczących z innych pakietów
     int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //template method design pattern
/*    public void goToSleep() {
        przygotujLegowisko();
        spij();
        wstawaj();
    }

    public abstract void przygotujLegowisko();
    public abstract void spij();
    public abstract void wstawaj();*/



    public void eat() {
        System.out.println("Zwierze sobie je");
    }

    public abstract void makeSound();
    //abstrakcyjna metoda nie ma ciała
}
