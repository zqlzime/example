/*
 * 
 * Copyright 2017 xujiangjun.
 * 
 */
package com.weidai.example.dao.mapper;

import com.weidai.example.dao.dataobject.UserBaseDO;

/**
 * 
 * u_base 表对应的Mapper类
 * 
 * @author 	zhang.chao
 * @date 	2019-01-05 11:17:12
 */
public interface UserBaseDOMapper {
    int deleteByPrimaryKey(Integer uid);

    int insert(UserBaseDO record);

    int insertSelective(UserBaseDO record);

    UserBaseDO selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(UserBaseDO record);

    int updateByPrimaryKey(UserBaseDO record);
}