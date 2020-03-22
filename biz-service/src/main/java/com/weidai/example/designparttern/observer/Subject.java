package com.weidai.example.designparttern.observer;

/**
 * Created by Administrator on 2020/2/19.
 * 接口，让weatherData来实现
 */
public interface Subject {

    public void registerObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObservers();


}
