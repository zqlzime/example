package com.weidai.example.designparttern.proxy.staticproxy;

/**
 * Created by Administrator on 2020/1/16.
 */
public class TeacherDAOProxy implements ITeacherDAO {

    private ITeacherDAO target;

    public TeacherDAOProxy(ITeacherDAO target) {
        this.target = target;
    }

    @Override
    public void teach() {
        System.out.println("代理开始");
        target.teach();
        System.out.println("代理结束");
    }
}
