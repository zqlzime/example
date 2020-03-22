package com.weidai.example.designparttern.singleton.type04;

/**
 * Created by Administrator on 2020/1/13.
 * 双重检查
 * 1） 双重检查是多线程中常用到的，只会创建一次实例，后面直接使用
 * 2） 线程安全：延迟加载，效率较高
 * 3） 结论：实际开发中推荐使用这种模式
 *
 */

public class SingletonTest04 {

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

    // volatile 将此变量加入到主内存中
    public static volatile Singleton instance;

    //提供一个静态公共的方法，加入双重检查，解决线程安全问题，同时解决懒加载问题
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
