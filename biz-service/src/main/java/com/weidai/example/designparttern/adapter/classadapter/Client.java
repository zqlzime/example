package com.weidai.example.designparttern.adapter.classadapter;

/**
 * Created by Administrator on 2020/1/14.
 * 类适配器模式
 */
public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.charging(new VoltageAdatper());

    }
}
