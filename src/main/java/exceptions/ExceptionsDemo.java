package exceptions;

import oop.inheritance.animals.Dog;

import java.util.NoSuchElementException;

public class ExceptionsDemo {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 1);
            Dog dog = new Dog();
            dog.aport();
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[100]);
            System.out.println("Hello try");

        } catch (ArithmeticException e) {
            System.out.printf("wystąpił wyjątek o nazwie %s z wiadomością: %s\n",
                    e.getClass().getSimpleName(), e.getMessage());
        } catch (NullPointerException | NoSuchElementException e) { //multicatch - taka sama obsługa kilku różnych wyjątków
            e.printStackTrace();
            System.out.println("Null");
        } catch (Exception e) {
            System.out.println("Niespodziwany wyjątek: " + e.getClass());
        }finally {
            System.out.println("Kod sprzątający który uruchomi się niezależnie czy wystąpi jakiś wyjątek czy program wykona się poprawnie");
        }
        System.out.println("Kontynuacja programu");
    }
}
