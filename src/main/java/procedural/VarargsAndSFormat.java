package procedural;

import java.util.Random;

public class VarargsAndSFormat {
    public static void main(String[] args) {
        String name = "Daniel";
        double age = 100;
        System.out.println("Imię to: " + name + " wiek to " + age + " lat");
        System.out.printf("Imię to: %s wiek to %f lat\n",name,age);  // \n,\\,\",\t
        //%s -> String
        //%d -> całkowite
        //%f -> zmiennoprzecinkowe
        //%b -> boolean

        System.out.println("Hello");

        for (int i = 0; i < 100; i++) {
            Random random = new Random();
            age = random.nextInt(5, 100);
            age += random.nextDouble();
           // System.out.printf("Imię to: %s wiek to %5.2f lat\n",name,age);  //5 symboli na liczbę i 2 po przecinku
            String formattedString = String.format("Imię to: %s wiek to %5.2f lat\n", name, age);
            // jeśli chcemy formatować ale nie wyświetlać: String.format()
            System.out.println(formattedString);
        }

        int[] myNumbers ={123, 45, 56};
        //int result = sum(new int[]{123, 45, 56});
        int result = sum(myNumbers);
        System.out.println(result);
        result = sum(3, 4, 56, 675, 4, 3424324, 234, 56456, 456, 456, 456); // dowolna ilość parametrów, zostaną zebrane do tablicy
        System.out.println(result);
    }


    private static int sum( int... numbers) {

        int allNumbers = 0;
        for (int number : numbers) {
            allNumbers += number;
        }
        return allNumbers;
    }
}
//todo slf4j logger + logger factory
