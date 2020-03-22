package com.weidai.example.designparttern.builder;

/**
 * Created by Administrator on 2020/1/13.
 */
public class Client {
    public static void main(String[] args) {
        //盖普通房子
        CommonHouse commonHouse = new CommonHouse();
        //准备创建房子的指挥者
        HouseDirector houseDirector = new HouseDirector(commonHouse);
        houseDirector.constructHouse();
    }
}
