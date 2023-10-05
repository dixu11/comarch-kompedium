package multithread;

public class Multithreading2 {
    public static void main(String[] args) throws InterruptedException {
        //zadanie
        Runnable task = new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i < 10_000; i++) {
                    System.out.println("Second Thread");
                }
            }
        };

        Runnable task2 = new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i < 10_000; i++) {
                    System.out.println("THIRD");
                }
            }
        };

        //pracownik
        Thread thread = new Thread(task);
        Thread thread2 = new Thread(task2);

        //odpalenie
        thread.start();
        thread2.start();

        thread.join(); // czekam na ten wątek
        thread2.join(); // czekam na ten wątek

        for (int i = 0; i < 10_000; i++) {
            System.out.println("m a i n");
        }
    }
}
