package com.weidai.example.designparttern.template;

/**
 * Created by Administrator on 2020/1/16.
 * 红豆豆浆
 */
public class RedBeanSoyaMilk extends SoyaMilk {

    @Override
    void addCondiments() {
        System.out.println("加入上好的红豆,,,");
    }
}
