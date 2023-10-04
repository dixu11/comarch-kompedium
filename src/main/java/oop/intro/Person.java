package oop.intro;

public class Person {

    //cechy/wartości/stan
     String name;
     int age;

    public void sayHello() {
        System.out.printf("Nazywam się %s mam %d lat!\n",name,age);
    }

    public  void haveBirthday() {
        age++;
    }


    //zachowania



}
