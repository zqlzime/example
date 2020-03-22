package com.weidai.example.designparttern.builder;

/**
 * Created by Administrator on 2020/1/13.
 * 指挥者，这里指定制作流程，返回产品
 */
public class HouseDirector {

    HouseBuilder builder = null;

    public HouseDirector(HouseBuilder builder) {
        this.builder = builder;
    }

    public House constructHouse() {
        builder.buildBasic();
        builder.roffed();
        builder.buildWall();
        return builder.buildHouse();
    }
}
