package com.weidai.example.designparttern.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2020/1/17.
 * 数据结构管理很多人
 */
public class ObjectStructure {
    private List<Person> persons = new ArrayList<>();

    public void attach(Person person) {
        persons.add(person);
    }

    public void detach(Person person) {
        persons.remove(person);
    }

    public void display(Action action) {
        for (Person p:persons) {
            p.accept(action);
        }
    }
}
