package com.weidai.example.designparttern.iterator;

import java.util.Iterator;

/**
 * Created by Administrator on 2020/2/18.
 */
public class ComputerCollegeIterator implements Iterator {

    Department[] departments; //department是以数组的方式存储
    int position = 0;//遍历的位置

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if (position >= departments.length || departments[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        Department department = departments[position];
        position += 1;
        return department;
    }

    public void remove() {

    }
}
