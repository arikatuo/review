package com.hy.threadpool;

import java.util.Date;

/**
 * Created by sumimasah on 2017/8/28.
 */
public class Handle implements Runnable {
    private String name;

    public Handle(String name) {
        this.name = "thread" + name;
    }

    @Override
    public void run() {
        System.out.println(name + " Start. Time = " + new Date());
        processCommand();
        System.out.println(name + " End. Time = " + new Date());
    }

    private void processCommand() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return this.name;
    }
}
