package com.weidai.example.designparttern.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * Created by Administrator on 2020/2/18.
 */
public class OutPutImpl {

    List<College> collegeList;

    public OutPutImpl(List<College> collegeList) {
        this.collegeList = collegeList;
    }

    public void printCollege() {
        Iterator<College> iterator = collegeList.iterator();
        while (iterator.hasNext()) {
            College college = iterator.next();
            System.out.println("===="+college.getName() +"=====");
            printDepartment(college.createIterator());
        }

    }

    public void printDepartment(Iterator iterator) {
        while (iterator.hasNext()) {
            Department department = (Department)iterator.next();
            System.out.println(department.getName());
        }
    }
}
