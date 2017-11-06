package com.hy.threadpool;

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by sumimasah on 2017/8/28.
 */
public class TestFixThreadPool {
    public static void main(String[] args) {
        {
            System.out.println("Main Thread: Starting at: " + new Date());
            ExecutorService exec = Executors.newFixedThreadPool(5);
            for (int i = 0; i < 10; i++) {
                exec.execute(new Handle(String.valueOf(i)));
            }
            exec.shutdown();  //执行到此处并不会马上关闭线程池
            System.out.println("Main Thread: Finished at:" + new Date());
        }
    }
}
