package com.weidai.example.mvc.controller.demo.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by long on 2018/3/30.
 */
public class MyInvocationHandler implements InvocationHandler {

    private Object object;

    public MyInvocationHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object object1, Method method, Object[] args) throws Throwable {
        return method.invoke(object,args);
        //return null;
    }

    public Object bind (Object object) {

        return Proxy.newProxyInstance(object.getClass().getClassLoader(),object.getClass().getInterfaces(),this);
    }

    public static void main(String[] args) {
        try {
            Student student = new Student();
            //System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles","true");

            //System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles","true");
            //获得加载被代理类的 类加载器
            //ClassLoader loader = Thread.currentThread().getContextClassLoader();
            //指明被代理类实现的接口
            Class<?>[] interfaces = student.getClass().getInterfaces();
            MyInvocationHandler myInvocationHandler = new MyInvocationHandler(student);

            Person person = (Person)myInvocationHandler.bind(student) ;
            person.sayHello("sdfsfd",33);
        }catch (Exception e) {
            e.printStackTrace();
        }


    }
}
