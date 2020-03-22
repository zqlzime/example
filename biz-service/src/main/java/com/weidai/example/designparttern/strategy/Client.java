package com.weidai.example.designparttern.strategy;

/**
 * Created by Administrator on 2020/2/19.
 */
public class Client {
    public static void main(String[] args) {
        WildDuck wildDuck = new WildDuck();
        wildDuck.fly();

        ToyDuck toyDuck = new ToyDuck();
        toyDuck.fly();

    }
}
