package com.weidai.example.designparttern.observer;

/**
 * Created by Administrator on 2020/2/19.
 * 观察者接口,由观察者来实现
 */
public interface Observer {

    public void update(float temperature,float pressure,float humidity);

}
