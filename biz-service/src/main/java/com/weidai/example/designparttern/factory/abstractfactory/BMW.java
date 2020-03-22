package com.weidai.example.designparttern.factory.abstractfactory;

/**
 * Created by Administrator on 2020/1/13.
 */
public class BMW implements Car {
    @Override
    public void getCar() {
        System.out.printf("来一辆BMW！");
    }
}
