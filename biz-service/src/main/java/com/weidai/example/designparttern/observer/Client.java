package com.weidai.example.designparttern.observer;

/**
 * Created by Administrator on 2020/2/19.
 */
public class Client {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        //创建观察者
        CurrentConditions currentConditions = new CurrentConditions();
        weatherData.registerObserver(currentConditions);

        BaiDuSite baiDuSite = new BaiDuSite();
        weatherData.registerObserver(baiDuSite);

        weatherData.setData(11.2f,11.0f,23.0f);
    }
}
