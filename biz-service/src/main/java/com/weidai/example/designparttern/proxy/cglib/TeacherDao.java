package com.weidai.example.designparttern.proxy.cglib;

/**
 * Created by Administrator on 2020/1/16.
 */
public class TeacherDao {

    public void teach() {
        System.out.println("老师授课中，我是cglib代理，不需要实现接口");
    }
}
