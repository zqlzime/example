package com.weidai.example.mvc.controller.demo.proxy;

/**
 * Created by long on 2018/3/30.
 */
public class PersonProxy implements Person {

    private Student student;

    public PersonProxy(Student student) {
        this.student = student;
    }

    @Override
    public void sayHello(String content, int age) {
        student.sayHello(content,age);
    }

    @Override
    public void sayGoodBye(boolean seeAgin, double time) {
        student.sayGoodBye(seeAgin,time);

    }
}
