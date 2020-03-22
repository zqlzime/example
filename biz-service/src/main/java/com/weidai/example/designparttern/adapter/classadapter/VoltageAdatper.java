package com.weidai.example.designparttern.adapter.classadapter;

/**
 * Created by Administrator on 2020/1/14.
 */
public class VoltageAdatper extends Voltage220v implements Voltage5v {
    @Override
    public int output5v() {
        //获取到220v电压

        int srcV = this.output220v();
        int dstV = srcV /44;

        return dstV;
    }
}
