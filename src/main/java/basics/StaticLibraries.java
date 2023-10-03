package basics;

import java.util.Arrays;

public class StaticLibraries {
    public static void main(String[] args) {
        //Byte, Double, Integer, Character, Boolean
        int number = Integer.parseInt("123");//konwersja String to int
        System.out.println(number * 2);
        int[] numbers = new int[1000];
        for (int i = 0; i < numbers.length; i++) { // ręczne wypełnienie
            numbers[i] = 10;
        }

        Arrays.fill(numbers, 5); // wypełnij
        System.out.println(numbers[555]);
        String arrayDisplay = "";
        for (int aNumber : numbers) {
            arrayDisplay += aNumber + " ";
            //System.out.println(aNumber);
        }
        System.out.println(arrayDisplay);

        for (int aNumber : numbers) {
            System.out.print(aNumber +" ");
        }
        System.out.println();
        System.out.println("Hello");
        System.out.println(Arrays.toString(numbers)); // szybki sposób na sprawdznie zawartości tablicy
    }
}
