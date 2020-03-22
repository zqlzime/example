package com.weidai.example.designparttern.bridge;

/**
 * Created by Administrator on 2020/1/14.
 */
public class Phone {

    private Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }

    protected void open() {
        this.brand.open();
    }
    protected void close() {
        this.brand.close();
    }
    protected void call() {
        this.brand.call();
    }
}
