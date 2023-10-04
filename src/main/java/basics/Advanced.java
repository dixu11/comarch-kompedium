package basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Advanced {
    public static void main(String[] args) {
        int number = 10, number2= 20, number3 = 30; // daklaracja wielu zmiennych tego samego typu
        if (number == 0)
            System.out.println("hello");
            System.out.println("Koniec"); // if bez klamry dotyczy tylko najbliższej instrukcji (hello)


        //metody + biblioteki
        //metody = funkcje klasy

        //statyczne i niestatyczne metody:

        //ta metoda jest wywoływana na klasie więc jest statyczna - statyczne oznacza przypisane do klasy
        int liczba = Integer.parseInt("10");


        //tą metodę wywołuję na obiekcie, więc jest niestatyczna czyli przypisana do obiektu
        Random random = new Random();
        System.out.println(random.nextInt(10));

        //to nie jest możliwe bo metoda nextInt nie jest statyczna
       // Random.nextInt(10);

        System.out.println(liczba);
        List<String> lista = new ArrayList<>();
        //wszystkie metody na zmiennej lista będą niestatyczne
        lista.add("hello");



    }
}

//todo rzutowanie
//todo StringBuilder
//todo slf4j logger + logger factory
//todo tablice wielowymiarowe
