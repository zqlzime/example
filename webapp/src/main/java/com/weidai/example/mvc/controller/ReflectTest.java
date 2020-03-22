package com.weidai.example.mvc.controller;

import com.weidai.example.mvc.controller.model.User;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2019/12/31.
 */
public class ReflectTest {
    public static User initUser() throws Throwable {
        //通过类装载器获取class对象
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        Class aClass = loader.loadClass("com.weidai.example.mvc.controller.model.User");

        //获取类的默认构造器，并通过它实例化对象
        Constructor constructor = aClass.getDeclaredConstructor(null);
        User user = (User) constructor.newInstance();

        Method setUserName = aClass.getMethod("setUserName",String.class);
        setUserName.invoke(user,"zhangsan");
        return user;
    }

    public static void main(String[] args) {
        try {
            User user = initUser();
            System.out.println(user.toString());
        }catch (Throwable e) {
            e.printStackTrace();
        }

    }
}

