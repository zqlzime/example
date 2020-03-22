package com.weidai.example.designparttern.adapter.objectadapter;

/**
 * Created by Administrator on 2020/1/14.
 * 对象适配器模式
 */
public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone();
        Voltage220v voltage220v = new Voltage220v();
        phone.charging(new VoltageAdatper(voltage220v));

    }
}
