// Concurrency programming.
// A system can run multiple process concurrently, an app can simulate multiple threads concurrently as well.


package com.Practice.Threads;

public class Beginning {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        for (var i = 0; i < 10; i++) {
            Thread thread = new Thread(new DownloadFileTask());
            thread.start();
        }
    }
}
