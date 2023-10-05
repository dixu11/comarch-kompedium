package multithread;

//rodzaje klas w javie
public class PublicClass {  //musi miec nazwę zgodną z nazwą pliku
    private int number;
    public static void main(String[] args) {
        PackageClass packageClass = new PackageClass();

//        LocalClass localClass = new LocalClass(); // nie działa

        class LocalClass{ // klasa zadeklarowana w metodzie

        }
        LocalClass localClass = new LocalClass(); // działa

        Car track = new Car(){ // anonimowa klasa
            @Override
            void drive() {
                System.out.println("Jedzie ciężarówka");
            }
        };

        track.drive();


    }

    class InnerClass { // klasa wewnętrzna może mieć różny dostęp
        // może być statyczna lub nie. Niestatyczna jest zawsze związana z obiektem klasy zewnętrznej


        public InnerClass() {
            number = 10;
        }
    }

}

class PackageClass { // każda inna niż publiczna klasa w tym samym pliku = klasa pakietowa


}

class Car{





    void drive() {
        System.out.println("Samochód jedzie");
    }
}
