package com.weidai.example.designparttern.factory.abstractfactory;

/**
 * Created by Administrator on 2020/1/13.
 * 抽象工厂模式　
 * 定义：为创建一组相关或相互依赖的对象提供一个接口，而且无需指定他们的具体类。

 　　抽象工厂与工厂方法的区别，就在于产品簇的问题，多了一种产品，这时候怎么办呢，
 就是在接口类里面加上创建大炮的方法，然后每个车间就可以有两个子车间分别来生产汽车和大炮。
 这样的话缺点也很显然的冒了出来，如果我又想生产飞机，那么我要需要更改所有的工厂车间以及工厂接口。

 　　抽象工厂模式是工厂方法模式的升级版本，他用来创建一组相关或者相互依赖的对象。他与工厂方法模式的区别就在于，
 工厂方法模式针对的是一个产品等级结构；而抽象工厂模式则是针对的多个产品等级结构。在编程中，通常一个产品结构，
 表现为一个接口或者抽象类，也就是说，工厂方法模式提供的所有产品都是衍生自同一个接口或抽象类，
 而抽象工厂模式所提供的产品则是衍生自不同的接口或抽象类。
 */
public class TestFactory {
    public static void main(String[] args) {
        Car byd = new FactoryTwo().getCarByFactory();
        byd.getCar();
        Plane airPlane = new FactoryOne().getPlaneByFactory();
        airPlane.getPlane();
    }
}
