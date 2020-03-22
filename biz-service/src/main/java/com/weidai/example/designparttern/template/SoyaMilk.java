package com.weidai.example.designparttern.template;

/**
 * Created by Administrator on 2020/1/16.
 * 抽象类，表示豆浆
 */
public abstract class SoyaMilk {

    //模板方法make,定义成final，不让子类去覆盖
    final void make() {
        select();
        addCondiments();

    }

    //选材料
    void select() {
        System.out.println("选择好的新鲜黄豆");
    }

    //添加不同的配料，子类去实现
    abstract void addCondiments();
}
