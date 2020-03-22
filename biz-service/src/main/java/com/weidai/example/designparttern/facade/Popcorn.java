package com.weidai.example.designparttern.facade;

/**
 * Created by Administrator on 2020/1/15.
 */
public class Popcorn {
    private static Popcorn instance = new Popcorn();

    public static Popcorn getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("Popcorn on ");
    }
    public void off() {
        System.out.println("Popcorn off ");
    }
    public void pop() {
        System.out.println("Popcorn pop ");
    }
}
