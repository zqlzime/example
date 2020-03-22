package com.weidai.example.test.threadpool;

/**
 * Created by WD05709 on 2019/4/21.
 */
public class ThreadPoolTask implements Runnable {
    private static final long serialVersionUID = 0;
    private static int consumeTaskSleepTime = 5000;
    //保存任务所需要的数据
    private Object threadPoolTaskData;
    ThreadPoolTask(Object works){
        this.threadPoolTaskData =works;
    }
    public void run(){
        //处理一个任务，这里的处理方式太简单了，仅仅是一个打印语句
        System.out.println( "start------"+threadPoolTaskData );
        try {
            //便于观察，等待一段时间
            Thread.sleep(consumeTaskSleepTime);
        } catch (Exception e) {
            e.printStackTrace();
        }
        threadPoolTaskData = null;
    }
    public Object getTask(){
        return this. threadPoolTaskData;
    }
}
