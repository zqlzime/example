package com.weidai.example.designparttern.facade;

/**
 * Created by Administrator on 2020/1/15.
 */
public class Projector {
    private static Projector instance = new Projector();

    public static Projector getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("Projector on ");
    }
    public void off() {
        System.out.println("Projector off ");
    }
    public void focus() {
        System.out.println("Projector focus ");
    }
}
