package com.weidai.example.mvc.controller.demo.proxy;

/**
 * Created by long on 2018/3/30.
 */
public class Student implements Person {

    @Override
    public void sayHello(String content, int age) {
        // TODO Auto-generated method stub
        System.out.println("student say hello" + content + " "+ age);
    }

    @Override
    public void sayGoodBye(boolean seeAgin, double time) {
        // TODO Auto-generated method stub
        System.out.println("student sayGoodBye " + time + " "+ seeAgin);
    }
}
