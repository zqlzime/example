package com.weidai.example.designparttern.strategy;

/**
 * Created by Administrator on 2020/2/19.
 */
public abstract class Duck {
    FlyBehavior flyBehavior;

    public Duck() {

    }

    public abstract void display(); //显示鸭子的信息

    public void quack() {
        System.out.println("鸭子嘎嘎叫");
    }
    public void swim() {
        System.out.println("鸭子会游泳");
    }
    public void fly() {
        if(flyBehavior != null) {
            flyBehavior.fly();
        }
    }
}
