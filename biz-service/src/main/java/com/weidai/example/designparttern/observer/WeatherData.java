package com.weidai.example.designparttern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2020/2/19.
 */
public class WeatherData implements Subject {

    // 温度，气压，湿度
    private float temperature;
    private float pressure;
    private float humidity;
    private List<Observer> observers;

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    public void dataChange() {
        notifyObservers();
    }

    public void setData(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        dataChange();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if (observers.contains(observer)) {
            observers.remove(observer);
        }
    }

    //遍历所有的观察者，并通知
    @Override
    public void notifyObservers() {
        for (Observer o: observers) {
            o.update(temperature,pressure,humidity);
        }
    }
}
