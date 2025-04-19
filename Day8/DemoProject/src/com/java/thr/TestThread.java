package com.java.thr;
class Hello extends Thread {
    @Override
    public void run() {
        synchronized (this) {
            for (int i = 0; i < 10; i++) {
                if (i == 5) {
                    try {
                        System.out.println("Thread waiting at i = " + i);
                        wait(); // ✅ Safe now: inside synchronized block
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

public class TestThread {
    public static void main(String[] args) {
        Hello helloThread = new Hello();
        helloThread.start();

        try {
            Thread.sleep(6000); // Give it time to hit wait()
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Notify the waiting thread
        synchronized (helloThread) {
            System.out.println("Main thread calling notify...");
            helloThread.notify();
        }
    }
}