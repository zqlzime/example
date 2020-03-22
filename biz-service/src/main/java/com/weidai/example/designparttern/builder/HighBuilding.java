package com.weidai.example.designparttern.builder;

/**
 * Created by Administrator on 2020/1/13.
 */
public class HighBuilding extends HouseBuilder {

    @Override
    public void buildBasic() {
        System.out.println("高楼砌墙");
    }

    @Override
    public void buildWall() {
        System.out.println("高楼砌墙");
    }

    @Override
    public void roffed() {
        System.out.println("高楼砌墙");
    }
}
