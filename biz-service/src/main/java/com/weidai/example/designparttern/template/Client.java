package com.weidai.example.designparttern.template;

/**
 * Created by Administrator on 2020/1/16.
 */
public class Client {
    public static void main(String[] args) {
        SoyaMilk redBeanSoyaMilk = new RedBeanSoyaMilk();
        redBeanSoyaMilk.make();

        SoyaMilk peanutSoyaMilk = new PeanutSoyaMilk();

        peanutSoyaMilk.make();
    }
}
