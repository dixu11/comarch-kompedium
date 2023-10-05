package multithread;

public class Multithreading3 {
    public static void main(String[] args) throws InterruptedException {
        //metoda stop jest depricated - zamiast niej używamy własną logikę wychodzenia z metody run
        StoppableTask stoppableTask = new StoppableTask();
        Thread thread = new Thread(stoppableTask);
        thread.start();
        Thread.sleep(1000);
        stoppableTask.setRunning(false);
        while (true) {
            System.out.println("Just main thread");
        }
        //
    }
}

class StoppableTask implements Runnable {

    private boolean running = true;

    @Override
    public void run() {
        while (true) {
            System.out.println("Running....");
            if (!running) {
                System.out.println("Interrupted!");
                return;
            }
        }
    }

    public void setRunning(boolean running) {
        this.running = running;
    }
}
