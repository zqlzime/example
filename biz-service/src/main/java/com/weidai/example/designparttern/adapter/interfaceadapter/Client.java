package com.weidai.example.designparttern.adapter.interfaceadapter;

/**
 * Created by Administrator on 2020/1/14.
 * 接口适配器模式
 */
public class Client {
    public static void main(String[] args) {
        AbsAdapter adapter = new AbsAdapter(){
            @Override
            public void m1() {
                //super.m1();
                System.out.println("使用m1的方法");
            }
        };
        adapter.m1();
    }
}
