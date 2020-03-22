package com.weidai.example.designparttern.singleton.type2;

/**
 * Created by Administrator on 2020/1/13.
 * 懒汉式(线程不安全)
 * 1) 启到了懒加载的效果，但只能在单线程下使用
 * 2) 如果在多线程环境中，有两个线程同时通过了if (instance == null)，这样就会产生
 * 多个实例，所以在多线程环境下不能使用这种方式。
 * 3）结论：实际开发中不要使用这种方式
 *
 */

public class SingletonTest02 {

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

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
