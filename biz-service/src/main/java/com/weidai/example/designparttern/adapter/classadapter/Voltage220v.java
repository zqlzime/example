package com.weidai.example.designparttern.adapter.classadapter;

/**
 * Created by Administrator on 2020/1/14.
 */
public class Voltage220v {

    public int output220v() {
        int src = 220;
        System.out.println("电压:"+src+"伏");
        return src;
    }
}
