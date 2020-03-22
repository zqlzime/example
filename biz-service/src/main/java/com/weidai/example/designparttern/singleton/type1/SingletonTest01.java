package com.weidai.example.designparttern.singleton.type1;

/**
 * Created by Administrator on 2020/1/13.
 * 饿汉式(静态变量)
 * 这种方式是基于classloader机制，避免了多线程的同步问题，不过instance在类装载的时候就实例化了
 * 但是类装载的原因有很多种，不能确定有其他的方式导致类装载，这时候初始化instance就没有达到
 * lazy loading的效果
 * 结论：这种模式可用，可能造成内存浪费
 *
 */

public class SingletonTest01 {

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
    public final static Singleton instance = new Singleton();

    public static Singleton getInstance() {
        return instance;
    }
}
