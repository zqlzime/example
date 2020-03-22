package com.weidai.example.mvc.controller.demo.proxy;

import com.weidai.example.dao.dataobject.UserDO;
import com.weidai.example.mvc.controller.model.User;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by long on 2018/3/30.
 */
public class ProxyTest {

    public static void main(String[] args) {

        //Student student = new Student();
//        PersonProxy personProxy = new PersonProxy(student);
//
//        personProxy.sayHello("ccc",11);
        User user = new User();
        user.setUserName("zhangsan");

        User user1 = new User();
        user1.setUserName("lisi");

        Map<User,User> map = new HashMap<User,User>();
        map.put(user,user);
        map.put(user1,user1);

        User user2 = map.get(user1);
        System.out.print(user2.getUserName());






    }
}
