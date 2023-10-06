package lambdaStream;

import exceptions.MyException;
import sklepJakub.Hero;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamDemo {
    public static void main(String[] args) throws MyException {
        int[] numArray = {1, 2, 3};
       /* Arrays.stream(numArray)  // zwraca IntStream z trochę innymi metodami niż Stream
                .boxed()*/ // zmienia IntStream na Stream


        List<Integer> numbers = new ArrayList<>();
        numbers.add(6);
        numbers.add(2);
        numbers.add(2);
        numbers.add(5);
        numbers.add(1);

        numbers.stream()
                .map(number -> "a".repeat(number))
                .forEach(letters -> System.out.println(letters));

        System.out.println("---------");

        List letters = numbers.stream()
                .map(number -> "a".repeat(number))
                .sorted()
                .distinct() // eliminuje powtórki
                .toList();
        System.out.println(letters);

        List<String> names = new ArrayList<>(List.of("Marcin", "Jan"));
        List<Hero> heroses = names.stream()
                .map(name -> new Hero(name))
                .toList();
        System.out.println(heroses);


        Hero hero = names.stream()
                .map(name -> new Hero(name))
                .filter(aHero -> aHero.getName().equals("Ania"))
                .findAny()
                //.orElse(null); // rozpakowuje optional
                .orElseThrow(() -> new MyException("Nie znaleziono herosa Ania"));

        System.out.println(hero);
    }
}
