package basics;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int liczbPodana;

        do {
            liczbPodana = scanner.nextInt();

            if (liczbPodana <= 3) {
                System.out.println("Mało");
            } else {
                System.out.println("Dużo");
            }

            if (liczbPodana % 2 == 0) {
                System.out.println("Parzysta");
            } else {
                System.out.println("Nieparzysta");
            }
        } while (liczbPodana != 0);
    }
}
