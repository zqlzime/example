package com.weidai.example.designparttern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2020/1/15.
 * University 就是composite,可以管理college
 */
public class University extends OrganizationComponent {

    List<OrganizationComponent> organizationComponents = new ArrayList<OrganizationComponent>();

    public University(String name, String des) {
        super(name, des);
    }

    @Override
    protected void add(OrganizationComponent organizationComponent) {
        organizationComponents.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponents.remove(organizationComponent);
    }

    @Override
    protected void print() {
        for (OrganizationComponent o : organizationComponents) {
            o.print();
        }

    }
}
