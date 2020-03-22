package com.weidai.example.designparttern.strategy;

/**
 * Created by Administrator on 2020/2/19.
 */
public class BadFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("这种鸭子飞翔技术一般");
    }
}
