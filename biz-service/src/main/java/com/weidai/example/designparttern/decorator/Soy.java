package com.weidai.example.designparttern.decorator;

/**
 * Created by Administrator on 2020/1/15.
 * 豆浆
 */
public class Soy extends Decorator {

    public Soy(Drink obj) {
        super(obj);
        setDes("豆浆");
        setPrice(1.5f);
    }
}
