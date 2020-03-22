package com.weidai.example.test.lock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by WD05709 on 2019/3/13.
 */
public class ReentrantLockThreadTest {
    public static void main(String[] args) {
        Runnable runnable = new ReentrantLockThread();
        new Thread(runnable,"a").start();
        new Thread(runnable,"b").start();
        ReentrantLock rr = new ReentrantLock(true);
    }
}
