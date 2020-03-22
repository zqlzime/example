package com.weidai.example.test.proxy.test1;

/**
 * Created by WD05709 on 2019/4/30.
 */
public interface UserManager {

    //新增用户抽象方法
    void addUser(String userName,String password);
    //删除用户抽象方法
    void delUser(String userName);
}
