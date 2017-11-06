package com.hy.thread;

/**
 * Created by sumimasah on 2017/8/30.
 */
public class Thread6 {

    public static void main(String[] args) {
        Thread myThread = new MyThread1();
        for (int i = 0; i < 1000; i++) {
            System.out.println("main thread i = " + i);
            if (i == 20) {
                myThread.setDaemon(true);
                System.out.println(myThread.isDaemon());
                myThread.start();
            }
        }
    }
}

class MyThread1 extends Thread {

    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("is = " + i);
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
