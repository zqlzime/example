/**
 *
 * Copyright (C), 2011-2016, 微贷网.
 */
package com.weidai.example.test;

import com.weidai.example.biz.service.Generator;
import com.weidai.example.dao.dataobject.UserBaseDO;
import com.weidai.example.dao.mapper.UserBaseDOMapperExt;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * 集成测试类
 * 
 * @author exgods
 * @version $Id: DemoTest.java, v 0.1 2016年5月15日 下午6:48:38 exgods Exp $
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath*:META-INF/spring/example-test-context.xml")
public class DemoTest {

    @Resource
    private UserBaseDOMapperExt userBaseDOMapperExt;

    @Resource
    private Generator generator;

    @Test
    public void test() {
        System.out.println("kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");
        if (generator.getNext() instanceof String) {
            System.out.println("string");
        }
        String str = (String) generator.getNext();

        System.out.println(str);
//        UserBaseDO userBaseDO = new UserBaseDO();
//        userBaseDO.setUserName("张三");
//        userBaseDO.setMobile("1515816992");
//        userBaseDO.setSex(1);
//        userBaseDOMapperExt.insert(userBaseDO);
    }






}
