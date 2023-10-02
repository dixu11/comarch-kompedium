package basics;

public class Petle {
    public static void main(String[] args) {
        /*//while

        while(){

        }

        //do-while
        do{

        }while();

        //for
        for(;;){

        }

        //for-each
        for(:){

        }*/

        //while -> do określonego zadarzenia -> wylosowano coś, wprowawdzono, gracz wygrywa (bo zebrał x punktów)
        //czy musi się wykonać minimum raz?
        //-> do-while
        //jeśli dopuszczamy opcje nie wykonania ani razu -> while

        //for -> gdy potrzebna numeracja powtórzeń (chcemy wykonać x razy, chcemy coś zrobić dla każdej pozycji w zbiorze)
        //gdy iterujemy po zbiorze (przeglądanie jaden po drugim, bez pomijania) i nie zamierzamy zmieniać struktury zbioru

      /*  int[] liczby = new int[4];
        liczby[0] = 23;
        liczby[1] = 2;
        liczby[2] = 7;
        liczby[3] = 70;*/
        //int[] liczby = new int[]{23, 2, 7, 70};
        int[] liczby = {23, 2, 7, 70};
        //liczby[4] = 70; //IndexOutOfBoundException

        System.out.println(liczby[0]);
        System.out.println(liczby[1]);
        System.out.println(liczby[2]);
        System.out.println(liczby[3]);
        System.out.println("-----");

        for (int i = 0; i < liczby.length; i++) {
            int liczba = liczby[i];
            System.out.println(liczba);
        }
        System.out.println("-----");

        for (int liczba : liczby) {
            System.out.println(liczba);
        }
        System.out.println("-----");


    }
}
