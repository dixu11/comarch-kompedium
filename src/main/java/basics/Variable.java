package basics;

import java.util.Random;

public class Variable {
    public static void main(String[] args) {
        //proste/prymitywne - stała pamięć na przechowywaną wartość

        //char - 2 bajty
        //boolean - 1 bajt

        //float - 4 bajty
        //double - 8 bajtów
        System.out.println(6/4.0);

        float wynik = 6.0f/4f;
        System.out.println(wynik);

        //float myFloat = wynik;
        float myFloat = 10.11f;




        //1 bit - 2 kombinacje
        //byte - 1 bajt = 8 bit
        //8 -> 2,4,8,16,32,64,128,256
        //w javie 1 bit jest przeznaczony na obecność minusa (dodatnia/ujemna)
        byte bit = 127; //nie 128 bo mamy jeszcze 0  //-128   ->    127
        System.out.println(bit);
        //short - 2 bajty = 16 bit
        short myShort = Short.MAX_VALUE;
        System.out.println(myShort);
        //int - 4 bajty = 32 bit
        int myInt = Integer.MAX_VALUE;
        System.out.println(myInt);
        //long - 8 bajtów = 64 bit
        long myLong = Long.MAX_VALUE;
        System.out.println(myLong);

        long myLong2 = 123_123_123_123L; // '_' dla czytelności


        System.out.println("2" + 2);
        System.out.println("Wynik 10+10 to: " + (10 + 10));

        boolean warunek = 10 > 7 && 10 < 1000;
        System.out.println(warunek);


        char character = 80;
        char character2 = 'P';
        System.out.println(character);
        if (bit == myShort) {
        }


        //pamięć dla zmiennej referencyjnej: 4-8 bajtów, zależy od systemu 32/64
        //adres zapisany w zmiennej referencyjnej prowadzi do wartości jaką jest obiekt w pamięci heap - dynamiczne przypisywanie pamięci
        //Referencyjne/obiektowe:
        // String, BigInteger, BigDecimal, StringBuilder, LocalDate, Random, Scanner.....
        Random random = new Random();
        String text = new String("abc");
        String text2 = "abc";
        String text3 = null;

        System.out.println(text == text2);
        System.out.println(text.equals(text2));
                         // equals domyslnie tez wykorzystuje == ale autor obiektu ma
                          // możliwość nadpisania tej metody na porownywanie po wartości


    }

}
