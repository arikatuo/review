package com.hy.threadpool;

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by sumimasah on 2017/8/28.
 */
public class TestCachedThreadPool {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main: Starting at: " + new Date());
        ExecutorService exec = Executors.newCachedThreadPool();   //创建一个缓冲池，缓冲池容量大小为Integer.MAX_VALUE
        for (int i = 0; i < 10; i++) {
            Handle handle = new Handle(String.valueOf(i));
            Thread thread = new Thread(handle);
//            exec.execute(new Handle(String.valueOf(i)));
            exec.execute(thread);
        }
        exec.shutdown();  //执行到此处并不会马上关闭线程池,但之后不能再往线程池中加线程，否则会报错
        System.out.println("Main: Finished all threads at" + new Date());
    }
}
