package com.weidai.example.designparttern.singleton.type06;

/**
 * Created by Administrator on 2020/1/13.
 * 枚举创建单例
 * 1）借助jdk1.5中添加的枚举来实现单例模式，不仅能避免多线程的同步问题，而且还能防止
 * 反序列化重新创建新的对象。
 * 2）这种方法也是effective java 中提倡的方法
 * 3）推荐使用
 *
 */

public class SingletonTest06 {

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.INSTANCE;
        Singleton singleton2 = Singleton.INSTANCE;
        System.out.println(singleton1 == singleton2);
    }
}

//使用枚举实现单例
enum Singleton {
    INSTANCE;//属性
    public void sayOk(){
        System.out.println("ok");
    }
 }
