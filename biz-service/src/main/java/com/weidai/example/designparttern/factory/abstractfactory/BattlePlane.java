package com.weidai.example.designparttern.factory.abstractfactory;

/**
 * Created by Administrator on 2020/1/13.
 */
public class BattlePlane implements Plane {
    @Override
    public void getPlane() {
        System.out.printf("来一架战斗机！");
    }
}
