package com.weidai.example.designparttern.flyweight;

/**
 * Created by Administrator on 2020/1/16.
 */
public class Client {
    public static void main(String[] args) {
        WebSiteFactory webSiteFactory = new WebSiteFactory();

        WebSite webSite = webSiteFactory.getWebSiteCategory("新闻");
        User user = new User();
        user.setName("张三");
        webSite.use(user);
    }
}
