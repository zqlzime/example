package com.weidai.example.designparttern.visitor;

/**
 * Created by Administrator on 2020/1/17.
 */
public class Client {
    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.attach(new Man());
        objectStructure.attach(new Woman());


        Success success = new Success();
        objectStructure.display(success);

        Fail fail = new Fail();
        objectStructure.display(fail);



    }
}
