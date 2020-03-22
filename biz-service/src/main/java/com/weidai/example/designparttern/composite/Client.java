package com.weidai.example.designparttern.composite;

/**
 * Created by Administrator on 2020/1/15.
 */
public class Client {
    public static void main(String[] args) {
        OrganizationComponent university = new University("清华大学","清华大学");

        //创建学院
        OrganizationComponent college = new College("计算机学院","计算机学院");

        college.add(new Department("软件工程","软件工程"));
        college.add(new Department("通信工程","通信工程"));

        university.add(college);
        university.print();
    }
}
