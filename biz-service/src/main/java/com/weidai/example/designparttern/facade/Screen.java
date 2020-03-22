package com.weidai.example.designparttern.facade;

/**
 * Created by Administrator on 2020/1/15.
 */
public class Screen {
    private static Screen instance = new Screen();

    public static Screen getInstance() {
        return instance;
    }

    public void up() {
        System.out.println("Screen up ");
    }
    public void down() {
        System.out.println("Screen down ");
    }

}
