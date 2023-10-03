package procedural;

import basics.Variable;

import java.util.Random;

public class StaticMethods {


    static void nazwa() {

    }


    //sygnatura (nagłówek) {
    //ciało
    // }

    public static void main(String[] args) {
        //sumowanie liczb i wyświetlanie
        int number1 = 10;
        int number2 = 20;
        int result = number1 + number2;
        System.out.println(result);

        //gdyby ta metoda była niestatyczna:
        /*StaticMethods obiekt = new StaticMethods();
        obiekt.nazwa();*/

        //gdy ta metoda jest statyczna szuka jej w tej klasie
//        StaticMethods.nazwa();
        nazwa();

//        dodaj();
//        dodaj();
//        dodaj();

        Random random = new Random();
        int generatedValue = random.nextInt(10); //0-9
        System.out.println(generatedValue);
        dodaj(33, 98);
        dodaj(2, 3);

        int wynik = dodaj(generatedValue, generatedValue + 10);
        System.out.println("Wynik dodawania to: " + wynik);

        int wynik2 = Variable.dodaj(1, 2);
        System.out.println(wynik2);
    }


    static int dodaj(int number1, int number2) {
//       int number1 = 10;
//       int number2 = 20;
        int result = number1 + number2;
        // System.out.println(result);
        return result;
    }


}
