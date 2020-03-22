package com.weidai.example.designparttern.proxy.staticproxy;

/**
 * Created by Administrator on 2020/1/16.
 */
public class TeacherDAO implements ITeacherDAO {

    @Override
    public void teach() {
        System.out.println("老师授课中...");
    }
}
