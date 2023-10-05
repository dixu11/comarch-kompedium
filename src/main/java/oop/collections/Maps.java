package oop.collections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {

        Map<String, Person> people = new HashMap<>();
        //mapy to takie tablice w których to my wybieramy po czym dostajemy się do wartości, np po Stirngach zamiast po indexach
        people.put("adam@gmail.com", new Person("Adam"));
        people.put("marcin@gmail.com", new Person("Marcin"));
        System.out.println(people);
        Person person1 = people.get("marcin@gmail.com");
        System.out.println(person1);
        //nie można iterować bezpośrednio po mapie, można po:
        //-kluczach
        //-wartościach
        //-parach

        for(String mail : people.keySet()){
            System.out.println(mail);
            System.out.println(people.get(mail));
        }
        System.out.println("----");
        //iteracja po wartościach
        for (Person person : people.values()) {
            System.out.println(person);
        }
        System.out.println("------");
        //iteracja po parach
        for (Map.Entry<String, Person> entry : people.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
