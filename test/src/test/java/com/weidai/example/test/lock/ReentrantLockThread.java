package com.weidai.example.test.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by WD05709 on 2019/3/13.
 */
public class ReentrantLockThread implements Runnable {
    // 创建一个ReentrantLock对象
    private final Lock lock = new ReentrantLock();
    @Override
    public void run() {
        try {
            lock.lock();
            for (int i = 0; i < 3; i++) {
                System.out.println(Thread.currentThread().getName() + "输出了：  " + i);
            }
        }finally {
            lock.unlock();
        }
    }
}
