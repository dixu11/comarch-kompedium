package multithread;

import java.util.concurrent.atomic.AtomicInteger;

public class Multithreading4 {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Thread thread1 = new Thread(counter);
        Thread thread2 = new Thread(counter);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(counter.getCounter());

    }
}

class Counter implements Runnable {

    private int counter = 0;
    //private AtomicInteger atomicInteger = new AtomicInteger(0);//ma synchronizacje wbudowaną

    @Override
    public void run() {
        for (int i = 0; i < 1_000; i++) {
//            int newValue = counter + 1;
//            counter = newValue;
            increment();
        }
    }

    private synchronized void increment() { //tylko jeden wątek na raz przez to przechodzi
        counter++;
    }

    public int getCounter() {
        return counter;
    }
}


/*
counter = 3
1: v:1
1: >1
2: v:2
2: >2
1: v:3
2: v:3
2: >3
2: v:4
2: >4
1: >3


*
*
*
*
* */
