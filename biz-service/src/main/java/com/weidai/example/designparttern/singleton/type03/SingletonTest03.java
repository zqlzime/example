package com.weidai.example.designparttern.singleton.type03;

/**
 * Created by Administrator on 2020/1/13.
 * 懒汉式(线程安全，同步方法)
 * 1) 线程安全，但是效率太低，多个线程获取instance时都需要同步
 * 2) 在实际开发中，不推荐使用这种方式
 *
 */

public class SingletonTest03 {

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2);
    }
}

class Singleton {
    //构造器私有化外部不能new
    private Singleton() {
    }

    // 本类内部创建对象实例
    public static Singleton instance;

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
