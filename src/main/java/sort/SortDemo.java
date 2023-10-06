package sort;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortDemo {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Zofia",40));
        people.add(new Person("Ania", 20));
        people.add(new Person("Jan",30));
        people.add(new Person("Anina",30));
        people.sort((p1,p2) -> {

            int difference = p1.getAge() - p2.getAge();
            if (difference == 0) {
                return p1.getName().compareTo(p2.getName());
            }
            return difference;
            /*if (p1.getAge() > p2.getAge()) {
                return 1;
            } else if (p1.getAge() < p2.getAge()) {
                return -1;
            } else {
                return p1.getName().compareTo(p2.getName());
            }*/
        });
        System.out.println(people);



        //żeby posortować trzeba przygotować comparator
        //comparator zwraca inta -> jeśli minusowy to układamy obiekt do tyłu, dodatni do przodu 0 -> są równe

        //implementujemy na obiekcie interface Comparable jeśli chcemy ustawić na nim domyślny sposób sortowania
        //on jest brany pod uwagę przez TreeSet i metodę Collections.sort();
        Collections.sort(people); // domyślne sortowanie

    }
}
class Person implements Comparable<Person>{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sayHelloTo(String otherName) {
        System.out.println("Cześć, jestem "  + name + " co słychać " + otherName + " ?");
    }

    public void sayHelloTo() {

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person person) {
        return age - person.getAge();
    }
}
