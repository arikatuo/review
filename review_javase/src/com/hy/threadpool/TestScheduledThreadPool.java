package com.hy.threadpool;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by sumimasah on 2017/8/28.
 */
public class TestScheduledThreadPool {
    public static void main(String[] args) {
        System.out.println("Main Thread: Starting at: "+ new Date());
        ScheduledThreadPoolExecutor exec = (ScheduledThreadPoolExecutor) Executors.newScheduledThreadPool(10);   //创建大小为10的线程池
        for(int i = 0; i < 10; i++) {
            exec.schedule(new Handle(String.valueOf(i)), 5, TimeUnit.SECONDS);//延迟10秒执行
        }
        exec.shutdown();  //执行到此处并不会马上关闭线程池
        while(!exec.isTerminated()){
            //wait for all tasks to finish
        }
        System.out.println("Main Thread: Finished at:"+ new Date());
    }
}
