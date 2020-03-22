package com.weidai.example.designparttern.visitor;

/**
 * Created by Administrator on 2020/1/17.
 */
public class Man extends Person {

    @Override
    public void accept(Action action) {
        action.getManResult(this);
    }
}
