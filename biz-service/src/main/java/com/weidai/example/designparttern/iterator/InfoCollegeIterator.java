package com.weidai.example.designparttern.iterator;


import java.util.Iterator;
import java.util.List;

/**
 * Created by Administrator on 2020/2/18.
 * 信息工程学院
 */
public class InfoCollegeIterator implements Iterator {

    List<Department> departmentList; //信息工程学院以list方式存储
    int index = -1; //索引

    public InfoCollegeIterator(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    @Override
    public boolean hasNext() {
        if (index >= departmentList.size() -1) {
            return false;
        } else {
            index +=1;
            return true;
        }
    }

    @Override
    public Object next() {
        return departmentList.get(index);
    }

    public void remove() {

    }
}
