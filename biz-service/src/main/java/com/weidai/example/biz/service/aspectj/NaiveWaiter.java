package com.weidai.example.biz.service.aspectj;

import com.weidai.example.biz.service.aspectj.Waiter;

/**
 * Created by Administrator on 2020/1/7.
 */
public class NaiveWaiter implements Waiter {

    @Override
    public void greetTo(String clientName) {
        System.out.println("NaiveWaiter greetTo:"+clientName);
    }

    @Override
    public void serveTo(String clientName) {
        System.out.println("NaiveWaiter serveTo:"+clientName);
    }
}
