package com.weidai.example.designparttern.builder;

/**
 * Created by Administrator on 2020/1/13.
 * product--产品
 */
public class House {
    private String baise;//地基
    private String wall;//墙
    private String roofed;//屋顶

    public String getBaise() {
        return baise;
    }

    public void setBaise(String baise) {
        this.baise = baise;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getRoofed() {
        return roofed;
    }

    public void setRoofed(String roofed) {
        this.roofed = roofed;
    }
}
