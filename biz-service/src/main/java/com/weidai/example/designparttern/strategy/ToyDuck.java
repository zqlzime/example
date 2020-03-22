package com.weidai.example.designparttern.strategy;

/**
 * Created by Administrator on 2020/2/19.
 */
public class ToyDuck extends Duck {

    public ToyDuck() {
        flyBehavior = new NoFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println("玩具鸭");
    }

    public void quack() {
        System.out.println("玩具鸭不能叫");
    }
    public void swim() {
        System.out.println("玩具鸭不会游泳");
    }
}
