package oop.inheritance;

import oop.inheritance.animals.Animal;
import oop.inheritance.animals.Dog;
import oop.inheritance.animals.Elephant;
import oop.inheritance.animals.Rat;

public class AnimalsDemo {
    public static void main(String[] args) {
        //dziedziczyć można bezpośrednio tylko jedną klasę (ale ona może dziedizczyć inną)



        Dog animal = new Dog();
        //  animal = new Rat(); //zadziała jeśli zmienna typu Dog
        // animal = new Random(); //zadziała jeśli typ Object

        Dog dog2 = new Dog("Luna", 9, "cavalier");

        //dziedziczymy typ!
        //możemy więc wstawić obiekt psa do zmiennej typu Animal
        //oraz wszystkie inne obiekty dziedziczące po animal
        //widzimy tylko te metody obecne na klasie Animal

        animal.eat();
        animal.bark();
        animal.aport();
        // animal.squick();
        System.out.println(animal.toString());

        Rat rat = new Rat();

        rat.eat();
        rat.squick();
        rat.run();

        //Dzidziczymy:
        //metody
        //pola
        //typ?
        //konstruktory - nie

        System.out.println("------KEEPER-----------");
        Elephant elephant = new Elephant("Filek",30);
        AnimalKeeper animalKeeper = new AnimalKeeper();
//        animalKeeper.feedDog(dog2);
//        animalKeeper.feedRat(rat);
        animalKeeper.feedAnimal3(dog2);
        animalKeeper.feedAnimal3(rat);
        animalKeeper.feedAnimal3(elephant);


        //polimorfizm, zdolność języka obiektowego
        //do tworzenia ogólnych typów zmiennych, dla wielu obiektów
        //metody będą dostosowywać swoje działanie
        System.out.println("----------");
        Animal anAnimal = new Dog();
        anAnimal.eat(); //behaves like a dog
        anAnimal = new Rat();
        anAnimal.eat(); //behaves like a rat

        System.out.println("----------");
      //  Animal animal10 = new Animal();// new Animal nie dizała bo klasa abstrakcyjna
        Animal[] animals = {dog2, anAnimal, rat};
        for (Animal nextAnimal : animals) {
            nextAnimal.makeSound();
        }

        System.out.println("-----------");

    }
}
