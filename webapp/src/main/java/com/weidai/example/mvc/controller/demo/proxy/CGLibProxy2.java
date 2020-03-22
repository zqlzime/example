package com.weidai.example.mvc.controller.demo.proxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by long on 2018/4/1.
 */
public class CGLibProxy2 implements MethodInterceptor {

    private static CGLibProxy2 cgLibProxy2 = new CGLibProxy2();

    public CGLibProxy2() {
    }

    public static CGLibProxy2 getInstance() {
        return cgLibProxy2;
    }
    public <T>T getProxy(Class<T> cls) {
        return (T) Enhancer.create(cls,this);
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        return methodProxy.invokeSuper(o,objects);
    }

    public static void main(String[] args) {
        try {
            //CGLibProxy2 cgLibProxy = new CGLibProxy2();
            Person person = CGLibProxy2.getInstance().getProxy(Student.class);
            //Person person = cgLibProxy.getProxy(Student.class);

            person.sayHello("sdfsfd", 33);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
