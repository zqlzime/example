/*
 * 
 * Copyright 2017 xujiangjun.
 * 
 */
package com.weidai.example.dao.mapper;

import com.weidai.example.dao.dataobject.StudentDO;

/**
 * 
 * student 表对应的Mapper类
 * 
 * @author 	zhang.chao
 * @date 	2019-01-05 11:48:36
 */
public interface StudentDOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(StudentDO record);

    int insertSelective(StudentDO record);

    StudentDO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StudentDO record);

    int updateByPrimaryKey(StudentDO record);
}