package com.weidai.example.designparttern.adapter.objectadapter;

/**
 * Created by Administrator on 2020/1/14.
 */
public class VoltageAdatper implements Voltage5v {

    private Voltage220v voltage220v;

    public VoltageAdatper(Voltage220v voltage220v) {
        this.voltage220v = voltage220v;
    }

    @Override
    public int output5v() {
        int dst = 0;
        if (this.voltage220v != null) {
            int src = voltage220v.output220v();
            System.out.println("使用对象适配器进行适配");
            dst = src/44;
            System.out.println("适配完成，输出电压为:"+dst);
        }
        return dst;
    }
}
