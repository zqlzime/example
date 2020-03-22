package com.weidai.example.designparttern.factory.abstractfactory;

/**
 * Created by Administrator on 2020/1/13.
 */
public class AirPlane implements Plane {
    @Override
    public void getPlane() {
        System.out.printf("来一架客机！");
    }
}
