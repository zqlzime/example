package com.weidai.example.test.proxy.test1;

/**
 * Created by WD05709 on 2019/4/30.
 */
public class UserManagerImpl implements UserManager {

    //重写新增用户方法
    @Override
    public void addUser(String userName, String password) {
        System.out.println("调用了新增的方法！");
        System.out.println("传入参数为 userName: "+userName+" password: "+password);
    }
    //重写删除用户方法
    @Override
    public void delUser(String userName) {
        System.out.println("调用了删除的方法！");
        System.out.println("传入参数为 userName: "+userName);
    }
}
