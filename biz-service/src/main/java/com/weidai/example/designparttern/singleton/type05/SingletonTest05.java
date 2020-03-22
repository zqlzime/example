package com.weidai.example.designparttern.singleton.type05;

/**
 * Created by Administrator on 2020/1/13.
 *  静态内部类
 *  1) 这种方式采用了类加载机制来保证初始化实例只有一个线程
 *  2） 静态内部类方式在Singleton类被装载时不会立即实例化，在被调用getInstance()方法
 *  时才会装载SingletonInstance类，从而完成Singleton的实例化。
 *  3）类的静态属性只会在第一次加载类的时候初始化，在这里jvm帮我们保证了线程的安全性，
 *  在类进行初始化时，别的线程是无法进入的。
 *  4）优点：避免了线程安全，利用静态内部类实现延迟加载，效率高，推荐使用。
 *
 */

public class SingletonTest05 {

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

    private static class SingletonInstance {
        private static final Singleton instance = new Singleton();
    }

    //提供一个静态公共的方法，加入双重检查，解决线程安全问题，同时解决懒加载问题
    public static Singleton getInstance() {
        return SingletonInstance.instance;
    }
}
