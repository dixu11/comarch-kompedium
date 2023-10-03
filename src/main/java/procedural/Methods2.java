package procedural;

import java.util.Random;

public class Methods2 {

  // static int points; //pola maja domyslna wartosc tak jak puste tablice, maja modyfikatory dostepu

    public static void main(String[] args) {
        int points = 0;
        for (int i = 0; i < 10 && points < 50; i++) {
           points = rozegrajRunde(points);
        }
        System.out.println("Na koniec: " + points);
    }

    static int rozegrajRunde(int allPoints) {
        Random random = new Random();
        int newPoints = random.nextInt(10) + 1; //1-10
        allPoints += newPoints;
        System.out.println("Gracz dostaje: " + newPoints + " punktów");
        System.out.println("Gracz ma: " + allPoints + " punktów łącznie");
        return allPoints;
    }
}
