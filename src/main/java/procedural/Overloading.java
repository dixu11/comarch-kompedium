package procedural;

import java.util.Scanner;

public class Overloading {

    public static void main(String[] args) {
        System.out.println(add(1,2));
        System.out.println(add(1.,2));
        System.out.println(add(1.0,2));
        System.out.println(add(23,45,34));
    }

    private static double add(int number1, int number2) {
        System.out.println("M1");
        return number1 + number2;
    }

    private static double add(double number1, double number2) {
        System.out.println("M2");
        return number1 + number2;
    }

    private static int add(int number1, int number2, int number3) {
        System.out.println("M3");
        return number1 + number2 + number3;
    }


}
