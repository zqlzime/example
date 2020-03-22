package com.weidai.example.designparttern.builder;

/**
 * Created by Administrator on 2020/1/13.
 */
//抽象的建造者
public abstract class HouseBuilder {

    protected House house = new House();

    //构造流程
    public abstract void buildBasic();

    public abstract void buildWall();

    public abstract void roffed();

    public House buildHouse() {
        return house;
    }
}
