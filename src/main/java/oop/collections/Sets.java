package oop.collections;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Sets {
    public static void main(String[] args) {
        //ArrayList / LinkedList -> różnice + implementacja + testy
        Set<String> names = new HashSet<>();
        names.add("Adam");
        names.add("Julia");
        names.add("Adam");
        names.add("Ania");
        names.add("Artur");

        for (String name : names) {
            System.out.println(name.hashCode());
        }

        if (names.contains("Ania")) {
            System.out.println("Jest Ania!");
        }

//        String imie = names.get(2); // w setach nie istnieje koncepcja pozycji



        //w setach nie ma powtórek!
            //HashSet nie zapamiętuje kolejności, kolejność wynika z Hashy


        //Kontrakt między equals + hashcode.
        //Hashcode to liczbowa reprezentacja obiektu
        //dwa różne obiekty mogą mieć ten sam hash
        //dwa obiekty o różnym hashu są na pewno różne
        //set dzieli obiekty na różne podzbiory po hashach ograniczając w ten sposób ilość potrzenych wywołań
        //metody equals() (wolniejszej) tylko do sytuacji w której hash jest taki sam

        Set<Person> people = new HashSet<>();
        Person osoba = new Person("Marcin");
        people.add(osoba);
        people.add(osoba);
        people.add(new Person("Marcin"));
        people.add(new Person("Adam"));
        System.out.println(people);


        //LinkedHashSet - pamięta kolejność
        //TreeSet - zamiast equals + hashCode używa metody compare() i kolejność jest zawsze posortowana
    }
}

class Person{
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) { // metoda equals domyślnie porównuje po referencji ale możemy nadpisać żeby porównywała po polach
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
