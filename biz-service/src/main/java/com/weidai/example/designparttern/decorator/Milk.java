package com.weidai.example.designparttern.decorator;

/**
 * Created by Administrator on 2020/1/15.
 */
public class Milk extends Decorator {

    public Milk(Drink obj) {
        super(obj);
        setDes("牛奶");
        setPrice(2.0f);
    }
}
