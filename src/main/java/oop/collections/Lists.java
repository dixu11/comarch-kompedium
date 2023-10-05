package oop.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        List names = new LinkedList(); //= lista na Object
        System.out.println(names.size());
        names.add("abc");
        names.add("fff");
        names.add("sdf");
        names.add(123);
        System.out.println(names);
        System.out.println(names.size());
       // names.remove(2);
       String text =(String) names.get(2);
        System.out.println(text);

        List<String> names2 = new ArrayList<>();
        names2.add("Ala");
        names2.add("Ada");
        names2.add("Adrian");
        //names2.add(123);
       // names2.set(10,"abc");
        //System.out.println(names2.get(10));
        List<String> elements = new ArrayList<>( List.of("a", "b", "c") ) ;
        System.out.println(elements);
        elements.add("d");
        System.out.println(elements);

        List<Integer> numbers = new ArrayList<>(); //Boolean, Character, Double...
        numbers.add(123);
        System.out.println(numbers);
    }
}
