package oop.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {
        //ArrayListy nie nadają się na kolejkę, używamy częściej LinkedList
        Queue<String> names =new LinkedList<>();
        names.add("Jan");
        names.add("Magda");
        names.add("Zofia");

        String person = names.remove();
        System.out.println(person);
        System.out.println(names);
        person = names.remove(); //zwraca i usuwa
        System.out.println(person);
        person = names.element();//tylko zwraca (jak metoda get w listach)
        System.out.println(person);
        System.out.println(names);

        //jeszcze są takie metody jak metoda poll która działa jak remove ale nie rzuca wyjątku tylko zwraca null
//        names.remove();
//        names.remove();
//        names.remove();
//        names.remove();
//        names.remove();
        System.out.println(names.poll());
        System.out.println(names.poll());
        System.out.println(names.poll());
        System.out.println(names.poll());

        //Deque - do stosów
    }
}
