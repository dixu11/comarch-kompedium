package procedural;

import java.util.Random;

public class Methods2 {

  private static int points; //pola maja domyslna wartosc tak jak puste tablice, maja modyfikatory dostepu


    public static void main(String[] args) {
       // int points = 0; // zmienna lokalna (w metodzie) może przysłaniać pole (zmienną w klasie)
        for (int i = 0; i < 10 && points < 50; i++) {
            playRound();
        }
        System.out.println("Na koniec: " +points);
    }

   private static void playRound() {
        Random random = new Random();
        int newPoints = random.nextInt(10) + 1; //1-10
        points += newPoints;
        System.out.println("Gracz dostaje: " + newPoints + " punktów");
        System.out.println("Gracz ma: " + points + " punktów łącznie");
    }

}
