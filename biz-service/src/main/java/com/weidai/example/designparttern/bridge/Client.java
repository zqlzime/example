package com.weidai.example.designparttern.bridge;

/**
 * Created by Administrator on 2020/1/14.
 */
public class Client {
    public static void main(String[] args) {
        Phone phone1 = new FolderPhone(new XiaoMi());
        phone1.open();
        phone1.call();
        phone1.close();

        Phone phone2 = new FolderPhone(new Vivo());
        phone2.open();
        phone2.call();
        phone2.close();
    }
}
