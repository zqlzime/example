package com.weidai.example.designparttern.decorator;

/**
 * Created by Administrator on 2020/1/14.
 */
public class Decorator extends Drink {

    private Drink obj;

    public Decorator(Drink obj) {
        this.obj = obj;
    }

    @Override
    public float cost() {

        return super.getPrice() + obj.cost();
    }

    @Override
    public String getDes() {
        return des +" " +getPrice()+"&&"+obj.getDes();
    }
}
