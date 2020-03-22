package com.weidai.example.current;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Administrator on 2020/2/23.
 */
public class CountDownLatchTest {

    //用于聚合所有的统计指标
    private static Map<String,Integer> map=new HashMap<String,Integer>();
    //创建4个计数器
    private static CountDownLatch downLatch = new CountDownLatch(4);


    public static void main(String[] args) {
        //记录开始时间
        long startTime=System.currentTimeMillis();
        Thread cntuserThread = new Thread(new Runnable() {
            @Override
            public void run() {

                System.out.println("正在统计新增用户数量");
                try {
                    Thread.sleep(3000);//任务执行需要3秒
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                map.put("userNumber",1);//保存结果值
                downLatch.countDown();//标记已经完成一个任务
                System.out.println("统计新增用户数量完毕");
            }
        });
        Thread countOrderThread=new Thread(new Runnable() {
            public void run() {

                    System.out.println("正在统计订单数量");
                    //Thread.sleep(3000);//任务执行需要3秒
                    map.put("countOrder",2);//保存结果值
                    downLatch.countDown();//标记已经完成一个任务
                    System.out.println("统计订单数量完毕");

            }
        });
        Thread countGoodsThread=new Thread(new Runnable() {
            public void run() {

                    System.out.println("正在商品销量");
                    //Thread.sleep(3000);//任务执行需要3秒
                    map.put("countGoods",3);//保存结果值
                    downLatch.countDown();//标记已经完成一个任务
                    System.out.println("统计商品销量完毕");

            }
        });
        Thread countmoneyThread=new Thread(new Runnable() {
            public void run() {
                //try {
                    System.out.println("正在总销售额");
                    //Thread.sleep(3000);//任务执行需要3秒
                    map.put("countmoney",4);//保存结果值
                    downLatch.countDown();//标记已经完成一个任务
                    System.out.println("统计销售额完毕");

            }
        });

        //启动子线程执行任务
        cntuserThread.start();
        countGoodsThread.start();
        countOrderThread.start();
        countmoneyThread.start();

        try {
            downLatch.await();
            long endTime=System.currentTimeMillis();//记录结束时间
            System.out.println("------统计指标全部完成--------");
            System.out.println("统计结果为："+map.toString());
            System.out.println("任务总执行时间为"+(endTime-startTime)/1000+"秒");
        }catch (Exception e) {
            e.printStackTrace();
        }




    }
}
