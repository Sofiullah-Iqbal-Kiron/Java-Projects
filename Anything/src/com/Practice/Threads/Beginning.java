// Concurrency programming.
// A system can run multiple process concurrently, an app can simulate multiple threads concurrently as well.
// Multithreaded multitasking is under Java's control.


package com.Practice.Threads;

public class Beginning {
    public static void main(String[] args) {
        Thread downloadThread = new Thread(new Download());
        downloadThread.start();
    }

    private static void showCurrentThreads() {
        System.out.println(Thread.currentThread().getName());
    }
}
