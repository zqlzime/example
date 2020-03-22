package com.weidai.example.designparttern.iterator;

import java.util.Iterator;

/**
 * Created by Administrator on 2020/2/18.
 */
public interface College {

    public String getName();

    public void addDepartment(String name,String desc);//增加系

    public Iterator createIterator();//返回一个迭代器，遍历


}
