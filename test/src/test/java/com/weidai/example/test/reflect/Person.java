package com.weidai.example.test.reflect;

/**
 * Created by WD05709 on 2019/4/28.
 */
public class Person {

    public String name;

    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void print() {
        System.out.println(toString());
    }
}
