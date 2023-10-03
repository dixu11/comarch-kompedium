package basics;

public class StringMethods {

    public static void main(String[] args) {
        //immutable - niemodyfikowalny obiekt każda operacja na nim wytwarza nowy obiekt i zwraca go
        String napis = "a";
        System.out.println(napis.toUpperCase());
        System.out.println(napis);
        System.out.println(napis.repeat(4));
        System.out.println(napis);
        napis = napis.toUpperCase();
        System.out.println(napis);
        napis = " ";
        System.out.println(napis.isEmpty()); //true dla Stringa= ""
        System.out.println(napis.isBlank());//true jeśli są same białe znaki
        napis = "mleko;3.99;10";
        //dzielenie stringa na tablice po wskazanym fragmencie
        String[] elements = napis.split(";");
        for (String element : elements) {
            System.out.println(element);
        }

        //przegladanie po literach
       for(char symbol : napis.toCharArray()){
           System.out.println(symbol);
       }

        System.out.println("----------");
        for (int i = 0; i < napis.length(); i++) {
            System.out.println(napis.charAt(i));
        }


        //przykład statycznej metody
       // System.out.println(String.format("abc"));
    }
}
