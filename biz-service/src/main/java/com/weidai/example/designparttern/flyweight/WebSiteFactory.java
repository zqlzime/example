package com.weidai.example.designparttern.flyweight;

import java.util.HashMap;

/**
 * Created by Administrator on 2020/1/16.
 * 网站工厂类
 */
public class WebSiteFactory {
    private HashMap<String,ConcreteWebSite> pool = new HashMap<>();

    public WebSite getWebSiteCategory(String type) {
        if (!pool.containsKey(type)) {
            pool.put(type,new ConcreteWebSite(type));
        }
        return (WebSite) pool.get(type);
    }

    public int getWebSiteCount() {
        return pool.size();
    }
}
