package com.weidai.example.designparttern.observer;

/**
 * Created by Administrator on 2020/2/19.
 */
public class CurrentConditions implements Observer{

    // 温度，气压，湿度
    private float temperature;
    private float pressure;
    private float humidity;

    //更新天气情况
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("today temperature:"+temperature);
        System.out.println("today pressure:"+pressure);
        System.out.println("today humidity:"+humidity);
    }
}
