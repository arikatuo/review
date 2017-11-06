package com.hy.thread;

/**
 * Created by sumimasah on 2017/8/25.
 */
public class Thread2 {
    public static void main(String[] args) {
        System.out.println("主线程开始");
        Thread th1 = new thread_2("a");
        th1.start();
        try {
            th1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("主线程结束");
    }
}


class thread_2 extends Thread {
    private String name;

    public thread_2(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("子线程开始");
        for (int i = 0; i < 5; i++) {
            System.out.println("输出：" + i);
        }
        System.out.println("子线程结束");
    }
}