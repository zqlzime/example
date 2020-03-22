package com.weidai.example.designparttern.bridge;

/**
 * Created by Administrator on 2020/1/14.
 * 折叠式手机类，继承 抽象类phone
 */
public class FolderPhone extends Phone {

    public FolderPhone(Brand brand) {
        super(brand);
    }

    public void open() {
        super.open();
        System.out.println("折叠样式手机");
    }
    public void close() {
        super.close();
        System.out.println("折叠样式手机");
    }
    public void call() {
        super.call();
        System.out.println("折叠样式手机");
    }
}
