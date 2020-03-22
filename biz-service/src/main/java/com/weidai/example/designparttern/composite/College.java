package com.weidai.example.designparttern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2020/1/15.
 */
public class College extends OrganizationComponent {

    List<OrganizationComponent> organizationComponents = new ArrayList<OrganizationComponent>();

    public College(String name, String des) {
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
