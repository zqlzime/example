package com.weidai.example.designparttern.builder;

/**
 * Created by Administrator on 2020/1/13.
 */
public class CommonHouse extends HouseBuilder {

    @Override
    public void buildBasic() {
        System.out.println("普通房子打地基");
    }

    @Override
    public void buildWall() {
        System.out.println("普通房子砌墙");
    }

    @Override
    public void roffed() {
        System.out.println("普通房子盖屋顶");
    }
}
