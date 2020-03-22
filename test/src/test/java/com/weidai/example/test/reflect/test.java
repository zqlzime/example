package com.weidai.example.test.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by WD05709 on 2019/4/28.
 */
public class test {
    public static void main(String[] args) {
        try {
            test2();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static void test1() throws Exception{
        Class<?> c = Class.forName("com.weidai.example.test.reflect.Person");
        Person person = (Person) c.newInstance();
        person.setName("zhangsan");
        //person.print();
        Constructor<?>[] cc = c.getConstructors();
        cc[0].newInstance("lisi",22);
        cc[0].newInstance();
    }

    private static void test2() throws Exception{
        Class<?> c = Class.forName("com.weidai.example.test.reflect.Person");
        Method mm = c.getMethod("print");
        mm.invoke(c.newInstance());

        String nameString = c.getClassLoader().getClass().getName();
        System.out.println(nameString);
    }
}
