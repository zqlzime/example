package com.weidai.example.util;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 生成订单编号
 * 
 * @desription
 * @author chenKun
 * @createtime 2016年5月5日 下午10:12:14
 */
public class OrderIdGenerateUtil {

    /*********************************************************************
     * 产生一个唯一ID值
     * 
     * @return
     ********************************************************************/
    /**
     * 起始值
     */
    private static long             startVaue         = 0;
    /**
     * 随机数
     */
    private static int              random            = (int) (Math.random() * 1000 + 1);
    /**
     * 系统标示,信贷工厂-人工评估
     */
    public final static int         CF_MAN_EVALUATION = 1;

    private static SimpleDateFormat oFormat           = new SimpleDateFormat("yyyyMMddHHmmssSSS");
    private static DecimalFormat    format            = new DecimalFormat("000");

    /**
     * 生成唯一订单编号
     * 
     * @desription 格式:X-XXX-XXXXXXXXXXXXXXXXX-XXX
     * @desription 格式:系统标识-1000以内随机数-时间-计数
     * @params
     * @return
     * @author chenKun
     * @createtime 2016年5月5日 下午10:28:52
     */
    public static synchronized String getOrderId(int systemType) {
        startVaue++;
        startVaue = startVaue % 1000;
        String sStartVaue = format.format(startVaue);
        String sDate = oFormat.format(new Date());
        String formatRandom = format.format(random);
        return systemType + formatRandom + sDate + sStartVaue;
    }

    public static String orderIdGenerate(String busType) {

        String currDate = oFormat.format(new Date());

        return busType + currDate + format.format(Math.random() * 1000);
    }

    public static void main(String[] args) {
        System.err.println(getOrderId(CF_MAN_EVALUATION));
        System.err.println(getOrderId(CF_MAN_EVALUATION));
        System.err.println(getOrderId(CF_MAN_EVALUATION));
        System.err.println(getOrderId(CF_MAN_EVALUATION));
        System.err.println(getOrderId(CF_MAN_EVALUATION));
        System.err.println(getOrderId(CF_MAN_EVALUATION));

        Map<String, Object> map = new HashMap<>();

        int count = 0;
        for (int i = 0; i < 10; i++) {

            String id = OrderIdGenerateUtil.orderIdGenerate("10");
            System.out.println(id);

            if (map.containsKey(id)) {
                count++;
            } else {
                map.put(id, new Object());
            }

        }

        System.out.println(count);
    }

    /**
     * 生成公积金订单id
     * 
     * @return
     */
    public static synchronized String getHouseFundOrderId() {
        StringBuffer generateRandStr = new StringBuffer();
        Random rand = new Random();
        int length = 29;
        for (int i = 0; i < length; i++) {
            int randNum = rand.nextInt(10);
            generateRandStr.append(randNum);
        }
        return "wyr" + generateRandStr;
    }

    /**
     * 生成32位随机数
     * 
     * @return
     */
    public static String getUUID() {
        return UUID.randomUUID().toString().trim().replaceAll("-", "");
    }
}
