package com.weidai.example.test;

import com.alibaba.fastjson.JSON;
import com.weidai.example.biz.service.UserService;
import com.weidai.example.dao.dataobject.UserDO;
import com.weidai.example.dao.mapper.UserBaseDOMapperExt;
import com.weidai.example.dao.mapper.UserDOMapperExt;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by WD05709 on 2019/1/5.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath*:META-INF/spring/example-test-context.xml")
public class UserShardingTest {

    @Autowired
    private UserService userService;

    @Autowired
    private UserDOMapperExt userDOMapperExt;

    @Test
    public void insertTest() {
        UserDO record = new UserDO();
        record.setUserId(10);
        record.setName("张三11");
        record.setAge(11);
        userDOMapperExt.insert(record);
    }

    @Test
    public void selectByUserIdTest() {
        List<UserDO> userDOs = userDOMapperExt.selectByUserId(10);
        System.out.println(JSON.toJSON(userDOs));

    }

    @Test
    public void selectAllTest() {
        List<UserDO> userDOs = userDOMapperExt.selectAll();
        System.out.println(JSON.toJSON(userDOs));
    }

    @Test
    public void selectByUserIdList() {
        List<UserDO> userDOs = userDOMapperExt.selectByUserIdList();
        System.out.println(JSON.toJSON(userDOs));
    }
}
