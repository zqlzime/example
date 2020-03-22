package com.weidai.example.designparttern.factory.factorymethod;

import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2020/1/13.
 * 工厂方法模式,设计一个工厂的接口，你想要什么东西，就写个类继承于这个工厂，
 * 这样就不用修改什么，直接添加就行了。就相当于，我这个工厂是用来生汽车的，
 * 而要什么品牌的汽车具体分到了每个车间，如果新多了一种品牌的汽车，
 * 直接新增一个车间就行了。那么问题又来了，如果想要生产大炮怎么办？
 */
public class TestFactory {
    public static void main(String[] args) {
        Car bmw= new BMWfactory().getCarByFactory();
        bmw.getCar();

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("");
        Car car = applicationContext.getBean(Car.class);
        DefaultListableBeanFactory autowireCapableBeanFactory =
                (DefaultListableBeanFactory)applicationContext.getAutowireCapableBeanFactory();
    }
}
