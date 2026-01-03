package Multithreading;

class Counter {

    volatile int count = 0;  
    
    synchronized void increment() {
        count++;
    }
}

class MyThread extends Thread {

    Counter counter;

    MyThread(Counter counter) {
        this.counter = counter;
    }

    public void run() {

        int localValue = 0;
        localValue++;

        counter.increment();

        System.out.println(
            Thread.currentThread().getName() +
            " | Local Value: " + localValue +
            " | Count: " + counter.count
        );
    }
}

public class MultithreadingExample {

    public static void main(String[] args) {

        Counter counter = new Counter();

        MyThread t1 = new MyThread(counter);
        MyThread t2 = new MyThread(counter);

        t1.start();
        t2.start();

        
        try {
            Thread.sleep(100);
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Final Count: " + counter.count);
    }
}
