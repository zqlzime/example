package com.weidai.example.designparttern.proxy.staticproxy;

/**
 * Created by Administrator on 2020/1/16.
 */
public class Client {
    public static void main(String[] args) {
        TeacherDAO teacherDAO = new TeacherDAO();

        TeacherDAOProxy teacherDAOProxy = new TeacherDAOProxy(teacherDAO);
        teacherDAOProxy.teach();

    }
}
