package basics;

import java.util.Random;

public class SimpleProgram {
    public static void main(String[] args) {
        System.out.println("Hello world");
        System.out.println();
        System.out.println("Cześć");

        int liczba = 0;

        System.out.println("Twoja liczba to " + liczba);

        Random random = new Random();

        int liczbaWylosowana = random.nextInt(1, 11);
        System.out.println("Twoja liczba to " + liczbaWylosowana);

        liczbaWylosowana = random.nextInt(1, 7);
        System.out.println("Twoja liczba to " + liczbaWylosowana);

        float liczbaDzies = random.nextFloat(0.0f,1.0f);
        System.out.println("Twoja liczba dziesiętna to ");
        System.out.printf(" %.2f",liczbaDzies);


        for (int i = 0; i < 10; i++) {
            liczbaWylosowana = random.nextInt(1, 7);
            System.out.println("Twoja liczba to " + liczbaWylosowana);

            if (liczbaWylosowana <= 3) {
                System.out.println("Mało");
            } else {
                System.out.println("Dużo");
            }

            if (liczbaWylosowana % 2 == 0) {
                System.out.println("Parzysta");
            } else {
                System.out.println("Nieparzysta");
            }
        }
    }
}
