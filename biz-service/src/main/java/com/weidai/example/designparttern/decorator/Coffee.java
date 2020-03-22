package com.weidai.example.designparttern.decorator;

/**
 * Created by Administrator on 2020/1/14.
 */
public class Coffee extends Drink {
    @Override
    public float cost() {
        return super.getPrice();
    }
}
