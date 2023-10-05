package exceptions;

public class MyException extends Exception {

  /*  public MyException(String message) {
        super(message);
    }
  */


    private String message;

    public MyException(String message) {
        this.message = message;
    }

    public String getMyMessage() {
        return message;
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println("Start");
        try {
            method1();
        } catch (Exception e) {
           // System.out.println("Wystąpił MyException: " + e.getMyMessage()); //widoczne tylko jeśli MyException w catch - wiadomo z dziedziczenia
            System.out.println("Wystąpił MyException: " + e.getMessage());
        }
        System.out.println("Koniec");
    }

    public static void method1() throws MyException {
        System.out.println("method1 start");
        method2();
        System.out.println("method1 end");
    }

    public static void method2() throws MyException{
        System.out.println("method2 start");
        method3();
        System.out.println("method2 end");
    }

    public static void method3() throws MyException {
        System.out.println("method3 start");
        throw new MyException("Nie udało się zaczytać książki");
        //System.out.println("Błąd");

        // System.out.println("method3 end");
    }
}
