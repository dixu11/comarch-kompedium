package procedural;

import java.util.Scanner;

public class RecursiveCalls {
    public static void main(String[] args) {
        //sayHello(0);
        System.out.println("Podano: " + readValue2());
    }


    private static void sayHello(int number) {
        System.out.println(number);
        number++;
        if (number < 1000) { // bez tego StackOverflowError
            sayHello(number);
        }
    }


    private static int readValue() {
        int number;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj liczbę:");
            number = scanner.nextInt();
        } while (number < 0);
        return number;
    }

    private static int readValue2() { //to samo z wykorzystaniem rekurencji
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę:");
        int number = scanner.nextInt();
        if (number < 0) {
            return readValue2();//pamiętać o return!
        }
        return number;
    }
}
