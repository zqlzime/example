package com.weidai.example.test;

import com.alibaba.fastjson.JSON;
import com.weidai.example.biz.service.UserService;
import com.weidai.example.dao.dataobject.StudentDO;
import com.weidai.example.dao.dataobject.UserDO;
import com.weidai.example.dao.mapper.StudentDOMapperExt;
import com.weidai.example.dao.mapper.UserDOMapperExt;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by WD05709 on 2019/1/5.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath*:META-INF/spring/example-test-context.xml")
public class StudentShardingTest {

    @Autowired
    private StudentDOMapperExt studentDOMapperExt;

    @Test
    public void insertTest() {
        StudentDO record = new StudentDO();
        record.setStudentId(8);
        record.setName("张三");
        record.setAge(88);
        studentDOMapperExt.insert(record);
    }

    @Test
    public void selectByUserIdTest() {
        List<StudentDO> userDOs = studentDOMapperExt.selectStudentByParam(8);
        System.out.println(JSON.toJSON(userDOs));
    }

}
