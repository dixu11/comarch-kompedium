package oop.inheritance;

public  interface WildAnimal {

   public static final int NUMBER = 10; // zmienne w interface są domyślnie: public static final -> konwencja drukowanymi literami


    void bite();

   // void metoda(){  // nie pozwala stworzyc zwykłej metody, chyba że damy 'default'
    //}
}


//Konkretne                                      Abstrakcyjne
//Zwykła klasa        Klasa Abstrakcyjna         Interfejs
