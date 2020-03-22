package com.weidai.example.designparttern.visitor;

/**
 * Created by Administrator on 2020/1/17.
 */
public abstract class Action {

    //得到男性的测评结果
    public abstract void getManResult(Man man);


    //得到女性的测评结果
    public abstract void getWomanResult(Woman woman);
}