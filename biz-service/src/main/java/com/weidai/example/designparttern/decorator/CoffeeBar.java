package com.weidai.example.designparttern.decorator;

/**
 * Created by Administrator on 2020/1/15.
 */
public class CoffeeBar {
    public static void main(String[] args) {
        //装饰者模式下的订单：2份巧克力+1份牛奶的LongBlack

        //点一份longblack
        Drink order = new LongBlack();
        System.out.println("费用1："+order.cost());
        System.out.println("描述："+order.getDes());

        //加一份牛奶
        order = new Milk(order);
        System.out.println("order加了一份牛奶的费用："+order.cost());
        System.out.println("order加了一份牛奶的描述："+order.getDes());
    }
}
