package oop.intro;

import java.util.Random;

public class Demo {

    private static String field; //pola otrzymują domyślne wartości jak przy tablicach, dla referencji null
    public static void main(String[] args) {
        //typ prymitywny
        int number = 10;
        //obiekty
        int[] numbers = new int[]{11, 12, 13};
        String text = new String("14b");
        Random random = new Random();

        String empty;
        String empty2 = "null";
        String empty3 = "";
        String empty4 = null;
        //System.out.println(empty.toUpperCase());
        System.out.println(empty2.toUpperCase());
        System.out.println(empty3.toUpperCase());
        if (empty4 != null) {
            System.out.println(empty4.toUpperCase());
        }
        //System.out.println(field.toUpperCase());


        //obiekty:
        //-mają metody
        //-ich typ pochodzi od klasy (z dużej litery)
        //-są przechowywane w pamięci heap (wskaźnik/referencja w stack)
        //-referencje mogą przechowywać wartość null - brak obiektu (uwaga na null pointer przy wywoływaniu metody na takiej referencji)
        //-zawsze* obiekt jest tworzony z wykorzystaniem new (*z wyjątkiem kilku skrótów jak przy String)

        //Mój własny referencyjny typ : Person
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);

        System.out.println(person1.name);
        System.out.println(person2.name);
        System.out.println(person3.name);

       // Person.name = "Jan"; // tak tylko gdyby to było pole statyczne ale wtedy nie programujemy obiektowo
        person1.name = "Jan";
        person2.name = "Anna";
        person3.name = "Ania";

        System.out.println(person1.name); //gdyby name ustawić static to będzie samo Ania
        System.out.println(person2.name);
        System.out.println(person3.name);

        person1 = person2;
        person1.name = "Dariusz";
        person2.name = "Dariusz";
        System.out.println(person1.name);
        System.out.println(person2.name);
        System.out.println(person3.name);

        person1.age = 10;
        person2.age = 20;
        person3.age = 30;

        System.out.println("----");
    /*    System.out.println(person1.name);
        System.out.println(person1.age);
        System.out.println(person2.name);
        System.out.println(person2.age);
        System.out.println(person3.name);
        System.out.println(person3.age);*/
        person1.sayHello();
        person2.sayHello();
        person3.sayHello();
        person3.haveBirthday();
        person3.sayHello();
        System.out.println(person3.age);
    }
}
