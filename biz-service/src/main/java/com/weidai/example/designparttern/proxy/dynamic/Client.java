package com.weidai.example.designparttern.proxy.dynamic;

/**
 * Created by Administrator on 2020/1/16.
 */
public class Client {
    public static void main(String[] args) {
        ITeacherDAO teacherDAO = new TeacherDAO();
        ITeacherDAO proxyInstance = (ITeacherDAO)new ProxyFactory(teacherDAO).getProxyInstance();
        proxyInstance.teach();
    }
}
