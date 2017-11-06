package com.hy.thread;

/**
 * Created by sumimasah on 2017/8/30.
 */
public class Thread5 {

    public static void main(String[] args) {

        MyRunnable1 myRunnable1 = new MyRunnable1();
        Thread thread = new Thread(myRunnable1);

        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            if (i == 3) {
                thread.start();
            }
            if (i == 900) {
                myRunnable1.stopThread();
            }
        }
    }
}

class MyRunnable1 implements Runnable {

    private boolean stop;

    @Override
    public void run() {
        for (int i = 0; i < 100 && !stop; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

    public void stopThread() {
        this.stop = true;
    }

}
