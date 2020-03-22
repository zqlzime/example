package com.weidai.example.mvc.controller.demo.proxy;

import com.mysql.jdbc.TimeUtil;
import com.weidai.example.mvc.controller.model.User;

import java.util.*;
import java.util.concurrent.*;

/**
 * Created by Administrator on 2019/12/24.
 */
public class Test {
    public static void main(String[] args) throws Exception{
//        PriorityBlockingQueue<String> pbq=new PriorityBlockingQueue<String>();
//
//        pbq.add("b");
//
//        pbq.add("g");
//
//        pbq.add("a");
//
//        pbq.add("c");
//
//        //获取的时候会根据优先级取元素,插入的时候不会排序,节省性能
//
//        System.out.println( pbq.take());//a,获取时会排序,按优先级获取
        User user1 = new User();
        user1.setUserName("zhangsan");
        User user2 = new User();
        user2.setUserName("zhangsan");
        Set<User> userSet = new LinkedHashSet<>();
        userSet.add(user1);
        userSet.add(user2);
        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());
        System.out.println(userSet.size());

    }
}
