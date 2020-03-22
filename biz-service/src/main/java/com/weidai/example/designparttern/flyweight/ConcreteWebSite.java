package com.weidai.example.designparttern.flyweight;

/**
 * Created by Administrator on 2020/1/16.
 */
public class ConcreteWebSite extends WebSite {

    private String type = "";//网站发布的形式

    public ConcreteWebSite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("网站发布形式为:"+type+",谁在使用:"+user.getName());
    }
}
