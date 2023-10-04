package oop.constructors;

public class Tv extends Object{ // każda klasa i tak domyslnie dziedziczy po Object, tak by wyglądało to jawnie

    static String[] channels = {"TVP", "TVN", "HBO"};
    private int channelNr;
    private boolean running;

    public Tv(int nr, boolean running) { //konstruktor zawsze zwraca obiekt, nie regulujemy tego, i nazywa się tak jak klasa
        System.out.println("Tworzę TV");
        channelNr = nr;
        this.running = running;

        Tv me = this; // this referencja do obiektu ktory jest teraz tworzony albo na którym wywołano metodę
    }

    public Tv(int channelNr) {
        this.channelNr = channelNr;
        running = true;
    }

    void show() {
        if (!running) {
            System.out.println("TV unplugged");
            return;
        }
        System.out.printf("TV on channel nr %d: %s is running: %b\n", channelNr, getActualChannel(), running);
    }

    private String getActualChannel() {
        return channels[channelNr - 1];
    }


    public static void main(String[] args) {
        Tv tv = new Tv(1, true);
//        tv.actualChannel = "TVP";
//        tv.channelNr = 1;
//        tv.running = true;
        tv.show();

        Tv tv2 = new Tv(3);
//        tv2.actualChannel = "HBO";
//        tv2.channelNr = 3;
//        tv2.running = false;
        tv2.show();

        System.out.println(tv); // jeśli używamy obiekt w kontekście String automatycznie odpala się jego metoda toString
        System.out.println(tv2.toString());


        //konstruktory
        //enkapsulacja
        //toString
        //gettery/settery
    }

 /*   @Override // straznik czy to na pewno jest nadpisywanie = zgodność sygnatur
    public String toString(){
        return String.format("TV on channel nr %d: %s is running: %b", channelNr, getActualChannel(), running);
    }*/

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    @Override
    public String toString() {
        return "Tv{" +
                "channelNr=" + channelNr +
                ", running=" + running +
                ", actualChannel=" + getActualChannel()  +
                '}';
    }
}
