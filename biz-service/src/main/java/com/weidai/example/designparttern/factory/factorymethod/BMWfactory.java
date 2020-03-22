package com.weidai.example.designparttern.factory.factorymethod;

/**
 * Created by Administrator on 2020/1/13.
 */
public class BMWfactory implements CarFactory {
    @Override
    public Car getCarByFactory() {
        return new BMW();
    }
}
