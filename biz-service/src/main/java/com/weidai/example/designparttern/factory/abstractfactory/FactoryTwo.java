package com.weidai.example.designparttern.factory.abstractfactory;

/**
 * Created by Administrator on 2020/1/13.
 */
public class FactoryTwo implements Factory {
    @Override
    public Car getCarByFactory() {
        return new BYD();
    }

    @Override
    public Plane getPlaneByFactory() {
        return new BattlePlane ();
    }
}
