package com.weidai.example.designparttern.factory.simplefactory;

/**
 * Created by Administrator on 2020/1/13.
 */
public class BYD implements Car {
    @Override
    public void getCar() {
        System.out.printf("来一辆BYD！");
    }
}
