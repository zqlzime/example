package com.weidai.example.designparttern.command;

/**
 * Created by Administrator on 2020/1/17.
 * 创建命令接口
 */
public interface Command {
    public void execute();
    public void undo();
}
