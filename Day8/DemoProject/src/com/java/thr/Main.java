package com.java.thr;

class SharedData {
    private int data;
    private boolean hasData = false;

    public synchronized void produce(int value) {
        while (hasData) {
            try {
                wait(); // wait until the data is consumed
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        data = value;
        hasData = true;
        System.out.println("Produced: " + value);
        notify(); // notify the consumer thread
    }

    public synchronized void consume() {
        while (!hasData) {
            try {
                wait(); // wait until data is available
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Consumed: " + data);
        hasData = false;
        notify(); // notify the producer thread
    }
}

class Producer extends Thread {
    private SharedData shared;

    public Producer(SharedData shared) {
        this.shared = shared;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            shared.produce(i);
            try {
                Thread.sleep(500); // simulate time delay
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

class Consumer extends Thread {
    private SharedData shared;

    public Consumer(SharedData shared) {
        this.shared = shared;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            shared.consume();
            try {
                Thread.sleep(500); // simulate time delay
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        SharedData shared = new SharedData();

        Producer producer = new Producer(shared);
        Consumer consumer = new Consumer(shared);

        producer.start();
        consumer.start();
    }
}
