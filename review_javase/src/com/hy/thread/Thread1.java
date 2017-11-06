package com.hy.thread;

import static java.lang.Thread.sleep;

/**
 * Created by sumimasah on 2017/8/23.
 */
public class Thread1 {
    public static void main(String[] args) {
        Thread t1 = new thread_1("a");
        Thread t2 = new thread_1("b");
        t1.start();
        t2.start();

        for (int i = 1; i < 5; i++) {
            System.out.println("输：" + i);
            try {
                sleep((int) Math.random() * 10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

class thread_1 extends Thread {
    private String name;

    public thread_1(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 1; i < 5; i++) {
            System.out.println("输出：" + i);
            try {
                sleep((int) Math.random() * 10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}