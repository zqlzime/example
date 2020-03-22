package com.weidai.example.mvc.controller.queue;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2019/12/31.
 */
public class Netizen implements Delayed {

    //身份证
    private String ID;

    //名字
    private String name;

    //上网截止时间
    private long playTime;

    //比较优先级,时间最短的优先
    @Override
    public long getDelay(TimeUnit unit) {
        //上网截止时间减去现在当前时间=时长

        return this.playTime-System.currentTimeMillis();
    }

    @Override
    public int compareTo(Delayed o) {
        Netizen netizen=(Netizen) o;
        return this.getDelay(TimeUnit.SECONDS)-o.getDelay(TimeUnit.SECONDS)>0?1:0;
    }

    public Netizen(String iD, String name, long playTime) {
        ID = iD;
        this.name = name;

        this.playTime = playTime;

    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPlayTime() {
        return playTime;
    }

    public void setPlayTime(long playTime) {
        this.playTime = playTime;
    }
}
