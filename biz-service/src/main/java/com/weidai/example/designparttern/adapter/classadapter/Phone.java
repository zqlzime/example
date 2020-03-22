package com.weidai.example.designparttern.adapter.classadapter;

/**
 * Created by Administrator on 2020/1/14.
 */
public class Phone {

    public void charging(Voltage5v voltage5v) {
        if (voltage5v.output5v() == 5) {
            System.out.println("电压为5v，可以充电");
        }else {
            System.out.println("电压不为5v，不能充电");
        }
    }
}
