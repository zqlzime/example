package com.weidai.example.designparttern.composite;

/**
 * Created by Administrator on 2020/1/15.
 */
public class Department extends OrganizationComponent {

    public Department(String name, String des) {
        super(name, des);
    }

    @Override
    protected void print() {
        System.out.println(getName());
    }
}
