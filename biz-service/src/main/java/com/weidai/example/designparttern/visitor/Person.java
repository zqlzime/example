package com.weidai.example.designparttern.visitor;

/**
 * Created by Administrator on 2020/1/17.
 */
public abstract class Person {

    //提供一个方法让访问者可以访问
    public abstract void accept(Action action);
}
