/*
 * 
 * Copyright 2017 xujiangjun.
 * 
 */
package com.weidai.example.dao.mapper;

import com.weidai.example.dao.dataobject.UserDO;

/**
 * 
 * user 表对应的Mapper类
 * 
 * @author 	zhang.chao
 * @date 	2019-01-05 11:48:36
 */
public interface UserDOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserDO record);

    int insertSelective(UserDO record);

    UserDO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserDO record);

    int updateByPrimaryKey(UserDO record);
}