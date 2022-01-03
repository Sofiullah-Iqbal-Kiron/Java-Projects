package com.Practice.Threads;

// Runnable interface should be implemented by a class whose instances are intended to be executed by a thread.

public class DownloadFileTask implements Runnable {
    /**
     * When an object implementing interface {@code Runnable} is used
     * to create a thread, starting the thread causes the object's
     * {@code run} method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method {@code run} is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        System.out.println("Downloading file task: " + Thread.currentThread().getName());

        try {
            Thread.sleep(5000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Download completed: " + Thread.currentThread().getName());
    }
}
