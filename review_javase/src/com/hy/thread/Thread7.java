package com.hy.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by sumimasah on 2017/8/30.
 */
public class Thread7  {

    public static void main(String[] args) {
        Thread myThread1 = new MyThread2();
        Thread myThread2 = new MyThread3();
        myThread1.setPriority(Thread.MAX_PRIORITY);
        myThread2.setPriority(Thread.MIN_PRIORITY);
        for (int i = 0; i < 100; i++) {
            System.out.println("main thread i = " + i);
            if (i == 20) {
                myThread1.start();
                myThread2.start();
                Thread.yield();
            }
        }
    }

}

class MyThread2 extends Thread {
    private final Lock lock = new ReentrantLock();
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("myThread 1 --  i = " + i);
        }
    }
}

class MyThread3 extends Thread {

    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("myThread 2 --  i = " + i);
        }
    }
}
