package multithread;

public class Multithreading {
    public static void main(String[] args) {
        //zadanie
        StoppableTask stoppableTask = new StoppableTask();

        //pracownik
        Thread thread = new Thread(stoppableTask);

        //uruchomienie wątku
        thread.start();
        while (true) {
            System.out.println("Main thread");
        }
    }


}

class Task implements Runnable{
    @Override
    public void run() {
        doTask();
    }

    public  void doTask() {
        while (true){
            System.out.println("SECOND THREAD");
        }
    }
}
