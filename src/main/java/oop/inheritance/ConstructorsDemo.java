package oop.inheritance;

public class ConstructorsDemo {  //publiczna klasa musi nazywać się tak jak plik
    public static void main(String[] args) {
        A a = new A(10); //new A() wywołuje kod z konstruktora bezparametrowego klasy A
        System.out.println("---");
        B b = new B(); //ponieważ B dziedziczy po A wywoła się też jakiś konstruktor z A żeby stworzyć bazę dla B
    }
}

class A {
    private int number;

    public A(int number) {
        this.number = number;
        System.out.println("A");
        System.out.println("Number: " + number);
    }

    public A() {
        System.out.println("A2");
        System.out.println("Number: " + number);
    }
}

class B extends A {
    public B() {
        super(5); // konstruktor zawsze rozpoczyna się od jawnego lub nie wywowołania konstruktora z klasy bazowej przez: super(...);
        System.out.println("B");
    }
}
