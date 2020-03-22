package com.weidai.example.designparttern.strategy;

/**
 * Created by Administrator on 2020/2/19.
 */
public class PekingDuck extends Duck{

    public PekingDuck() {
        flyBehavior = new NoFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println("北京鸭");
    }
}
