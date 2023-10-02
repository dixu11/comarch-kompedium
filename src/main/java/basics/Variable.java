package basics;

public class Variable {
    public static void main(String[] args) {
        //proste/prymitywne - stała pamięć na przechowywaną wartość

        //char - 2 bajty
        //boolean - 1 bajt

        //float - 4 bajty
        //double - 8 bajtów

        //1 bit - 2 kombinacje


        //byte - 1 bajt = 8 bit
        //8 -> 2,4,8,16,32,64,128,256
        //w javie 1 bit jest przeznaczony na obecność minusa (dodatnia/ujemna)
        byte bit =  127; //nie 128 bo mamy jeszcze 0
        System.out.println(bit);
        //short - 2 bajty = 16 bit
        short myShort = Short.MAX_VALUE;
        System.out.println(myShort);
        //int - 4 bajty = 32 bit
        int myInt = Integer.MAX_VALUE;
        System.out.println(myInt);
        //long - 8 bajtów = 64 bit
        long myLong = Long.MAX_VALUE;
        System.out.println(myLong);



        //Referencyjne/obiektowe:
        // String, BigInteger, BigDecimal, StringBuilder, LocalDate, Random, Scanner.....


    }

}
