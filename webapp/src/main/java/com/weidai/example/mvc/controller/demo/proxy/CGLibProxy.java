package com.weidai.example.mvc.controller.demo.proxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by long on 2018/4/1.
 */
public class CGLibProxy implements MethodInterceptor {
    public <T>T getProxy(Class<T> cls) {
        return (T)Enhancer.create(cls,this);
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("事物开始。。。。。。");
        Object result = methodProxy.invokeSuper(o,objects);
        System.out.println("事物结束。。。。。。");
        return result;
    }

    public static void main(String[] args) {
        try {
            CGLibProxy cgLibProxy = new CGLibProxy();
            Person person = cgLibProxy.getProxy(Student.class);
            person.sayHello("sdfsfd", 33);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
