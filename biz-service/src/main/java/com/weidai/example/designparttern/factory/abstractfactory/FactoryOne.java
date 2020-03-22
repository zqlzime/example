package com.weidai.example.designparttern.factory.abstractfactory;

/**
 * Created by Administrator on 2020/1/13.
 */
public class FactoryOne implements Factory {
    @Override
    public Car getCarByFactory() {
        return new BMW();
    }

    @Override
    public Plane getPlaneByFactory() {
        return new AirPlane();
    }
}
