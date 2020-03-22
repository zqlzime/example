package com.weidai.example.designparttern.decorator;

/**
 * Created by Administrator on 2020/1/15.
 * 具体的Decorator，这里就是调味品
 */
public class Cholocate extends Decorator{

    public Cholocate(Drink obj) {
        super(obj);
        setDes("巧克力");
        setPrice(3.0f);//调味品价格
    }
}
