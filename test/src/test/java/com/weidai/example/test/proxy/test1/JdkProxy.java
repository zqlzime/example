package com.weidai.example.test.proxy.test1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by WD05709 on 2019/4/30.
 */
public class JdkProxy implements InvocationHandler {

    private Object target ;//需要代理的目标对象

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("JDK动态代理，监听开始！");
        Object result = method.invoke(target, args);
        System.out.println("JDK动态代理，监听结束！");
        return result;
    }

    private Object getJDKProxy(Object targetObject) {
        this.target = targetObject;
        //JDK动态代理只能针对实现了接口的类进行代理，newProxyInstance 函数所需参数就可看出
        return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(),targetObject.getClass().getInterfaces(),this);
    }

    public static void main(String[] args) {
        JdkProxy jdkProxy = new JdkProxy();
        //获取代理对象
        UserManager user = (UserManager)jdkProxy.getJDKProxy(new UserManagerImpl());
        user.addUser("admin", "123123");//执行新增方法
    }

    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }
}
