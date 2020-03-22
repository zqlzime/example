package com.weidai.example.designparttern.iterator;

/**
 * Created by Administrator on 2020/2/18.
 * 系
 */
public class Department {

    private String name;

    private String desc;

    public Department(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
