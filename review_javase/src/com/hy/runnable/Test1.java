package com.hy.runnable;

import static java.lang.Thread.MAX_PRIORITY;
import static java.lang.Thread.sleep;

/**
 * Created by sumimasah on 2017/8/23.
 */
public class Test1 {
    public static void main(String[] args) {
        Thread th1 = new Thread(new runnable1("a"));
        Thread th2 = new Thread(new runnable1("b"));
        th1.setPriority(MAX_PRIORITY);
        th1.start();
        th2.start();
    }
}

class runnable1 implements Runnable {
    private String name;

    public runnable1(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 1; i < 55; i++) {
            System.out.println("输出：" + i);
            try {
                sleep((int) Math.random() * 10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
