package com.weidai.example.test.threadpool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by WD05709 on 2019/4/21.
 */
public class ThreadPoolExcutorDemo {
    private static int produceTaskSleepTime = 5;
    private static int produceTaskMaxNumber = 200; //定义最大添加20个线程到线程池中
    public static void main(String[] args) {
        //构造一个线程池
        ThreadPoolExecutor threadPool = new ThreadPoolExecutor(2, 4, 3,
                TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(3),
                new ThreadPoolExecutor.AbortPolicy());
        for( int i=1; i<= produceTaskMaxNumber;i++){
            try {
                //一个任务，并将其加入到线程池
                String work= "work@ " + i;
                System.out.println( "put ：" +work);
                threadPool.execute( new ThreadPoolTask(work));
                //便于观察，等待一段时间
                Thread.sleep(produceTaskSleepTime);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
